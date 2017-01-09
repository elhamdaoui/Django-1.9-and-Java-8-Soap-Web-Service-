#-*- coding: utf-8 -*-
from datetime import datetime
from random import randint

from django.shortcuts import render
from django.shortcuts import redirect #pour la rediréction
from django.http import HttpResponse, Http404
from studyapp.models import * #importer tous les modèles
from studyapp.wsmodels import * #importer tous les modèles (soap)

import soaplib
from soaplib.core import Application as SoapCoreApp
from soaplib.core.server.wsgi import Application as AppWsgi
from soaplib.core.service import rpc, DefinitionBase, soap
from soaplib.core.model.primitive import String, Integer, Date, Decimal
from soaplib.core.model.clazz import Array
from soaplib.core.server import wsgi

from django.views.decorators.csrf import csrf_exempt

# Create your views here.

def accueil(request):
    """
    la vue accueil
    """
    text="C'est la page acceuil"
    return render(request,"studyapp/accueil.html",locals())


def tous_etudiants(request):
    """Vue récupére tous les étudiants"""
    etudiants=Etudiant.objects.all()
    return render(request,"studyapp/etudiants.html",locals())


#**************Créer notre service Pour les Etudiants ******

class EtudiantService(DefinitionBase):
    
#================================================ 
    @soap(_returns=Array(String))
    def showsDevloppers(self):
        return ['abdelmajid','ikram']
    
#================================================ 
    @soap(String,String,_returns=WsEtudiant)
    def get_etudiant(self,cne_e,passwd):
        """"""
        try:
            etd=Etudiant.objects.get(cne=cne_e,mdp=passwd)
            etdws=toEtudiant(etd)
        except:
            etdws=toEtudiant(None)
        return etdws
#================================================ 
    @soap(String,String,_returns=Array(WsInscription))
    def get_situation_pedago(self,cne_e,passwd):
        inscrs=[]
        try:
            etd=Etudiant.objects.get(cne=cne_e,mdp=passwd)
            inscrips=etd.inscription_set.all()
            for ins in inscrips:
                if ins.valide==1:
                    nomp,prenomp="",""
                    prof=ins.module.prof
                    if prof is not None:
                        nomp,prenomp=prof.nom,prof.prenom
                    inscrs.append(toInscription(ins,nomp,prenomp))
        except:
            a=6#rien a faire
        return inscrs
#================================================ 
    @soap(String,String,_returns=Array(WsInscription))
    def get_actual_inscriptions(self,cne_e,passwd):
        inscrs=[]
        try:
            etd=Etudiant.objects.get(cne=cne_e,mdp=passwd)
            inscrips=etd.inscription_set.all()
            for ins in inscrips:
                if ins.valide==0:
                    nomp,prenomp="",""
                    prof=ins.module.prof
                    if prof is not None:
                        nomp,prenomp=prof.nom,prof.prenom
                    inscrs.append(toInscription(ins,nomp,prenomp))
        except:
            a=6#rien a faire
        return inscrs  

#================================================ 
    @soap(String,String,_returns=Array(WsProfesseur))
    def get_professeurs_actuels(self,cne_e,passwd):
        """"""
        profs=[]
        try:
            etd=Etudiant.objects.get(cne=cne_e,mdp=passwd)
            inscrs=etd.inscription_set.all()
            for ins in inscrs:
                if ins.valide==0:
                    profs.append(toProfesseur(ins.module.prof))
        except:
            a=6
        return profs
        
#================================================ 
    @soap(Array(String),Array(String),_returns=WsEtudiant)
    def modification(self,keys,vals):
        
        try:
            cne_e,passwd=vals[0],vals[1]
            etd=Etudiant.objects.get(cne=cne_e,mdp=passwd)
            assert len(keys)>2
            for i in range(2,len(keys)):
                if keys[i]=='email':
                    etd.email=vals[i]
                if keys[i]=='mdp':
                    etd.mdp=vals[i]
                if keys[i]=='telephone':
                    etd.telephone=vals[i]
                if keys[i]=='adresse':
                    etd.adresse=vals[i]
            etd.save()
            return toEtudiant(etd)
        except:
            return toEtudiant(None)
        return toEtudiant(None)
#================================================       
    @soap(_returns=Array(WsSemestre))
    def get_all_semestres(self):
        """"""
        semestres=[]
        sems=Semestre.objects.all()
        for sem in sems:
            semestres.append(toSemestre(sem))
        return semestres
 #================================================   
        
    @soap(_returns=Array(WsEtudiant))
    def get_all_etudiants(self):
        """"""
        etudiants=Etudiant.objects.all()
        etdwss=[]
        for etd in etudiants:
            etdws=toEtudiant(etd)
            etdwss.append(etdws)
            
        return etdwss
#================================================
     
    @soap(_returns=Array(WsModule))
    def get_all_modules(self):
        """"""
        modules=Module.objects.all()
        modws=[]
        for mod in modules:
            modws.append(toModule(mod))
            
        return modws
 #================================================       
    @soap(_returns=Array(WsProfesseur))
    def get_all_professeurs(self):
        """"""
        profs=[]
        prs=Professeur.objects.all()
        for pr in prs:
            profs.append(toProfesseur(pr))
        return profs
      
 #================================================   
    @soap(_returns=Array(WsInscription))
    def get_all_inscriptions(self):
        
        inscriptions=[]
        #etd=Etudiant.objects.get(cne=cne_e)
        #inscrs=etd.inscription_set.all()
        inscrs=Inscription.objects.all()
        for ins in inscrs:
            inscriptions.append(toInscription(ins))
        return inscriptions
    
#================================================

#=====================
import StringIO
class DumbStringIO(StringIO.StringIO):
    def read(self, n):
        return self.getvalue()


class DjangoSoapApp(AppWsgi):
    csrf_exempt = True

    def __init__(self, services, tns):
        """Create Django view for given SOAP soaplib services and tns"""

        return super(DjangoSoapApp,
            self).__init__(SoapCoreApp(services, tns))

    def __call__(self, request):
        django_response = HttpResponse()

        def start_response(status, headers):
            django_response.status_code = int(status.split(' ', 1)[0])
            for header, value in headers:
                django_response[header] = value

        response = super(DjangoSoapApp, self).__call__(request.META,
            start_response)
        django_response.content = '\n'.join(response)

        return django_response
    

etudiant_service = DjangoSoapApp([EtudiantService], 'etudiantService')#__name__

"""
class DjangoSoapApp(AppWsgi):
    def __call__(self, request):
        django_response = HttpResponse()
        def start_response(status, headers):
            status, reason = status.split(' ', 1)
            django_response.status_code = int(status)
            for header, value in headers:
                django_response[header] = value
                
        environ = request.META.copy()
        environ['CONTENT_LENGTH'] = len(request.raw_post_data)
        environ['wsgi.input'] = DumbStringIO(request.raw_post_data)
        environ['wsgi.multithread'] = False

        response = super(DjangoSoapApp, self).__call__(environ, start_response)
        django_response.content = '\n'.join(response)
        return django_response
        
soap_etudiantws = SoapCoreApp([EtudiantService], 'tns')
etudiant_service = DjangoSoapApp(soap_etudiantws)
#etudiant_service= DjangoSoapApp([EtudiantService], 'tns')
"""
"""
if __name__=='__main__':
    try:
        from wsgiref.simple_server import make_server
        soap_application = soaplib.core.Application([HelloWorldService], 'tns')
        wsgi_application = wsgi.Application(soap_application)
        server = make_server('localhost', 7789, wsgi_application)
        server.serve_forever()
    except ImportError:
        print "Error: example server code requires Python >= 2.5"
"""