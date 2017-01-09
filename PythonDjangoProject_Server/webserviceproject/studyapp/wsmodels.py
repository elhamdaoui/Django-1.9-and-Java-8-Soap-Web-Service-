# -*- coding: utf-8 -*-
"""
Created on Thu Mar 24 01:48:21 2016

@author: abdelmajid
"""

from soaplib.core.model.primitive import String, Integer, Date, Decimal
from soaplib.core.model.clazz import ClassModel, Array


class WsSemestre(ClassModel):
        idsem = String
        
            
        
class WsProfesseur(ClassModel):
        cin = String
        code_emboche = Integer
        nom = String
        prenom = String
        ddn = String
        email = String
        adresse = String
        telephone = String
        description = String
        mdp = String
        

class WsModule(ClassModel):
        idm = String
        nom = String
        description = String
        semestre = String
        prof = WsProfesseur #on stocke ici le nom et prenom
        idm_eq = String
        #module_eq = WsModule #il le ne connais pas

class WsEtudiant(ClassModel):
        cin = String
        cne = Integer
        num_inscription = Integer
        nom = String
        prenom = String
        ddn = String
        date_ajt = String
        email = String
        adresse = String
        telephone = String
        typeLicence = String
        anneUniver = String
        orderAdmis = Integer
        description = String
        mdp = String
        #modules = Array(WsModule)
        
class WsInscription(ClassModel):
        cne_etudiant = String
        id_m = String
        nom_module = String
        semestre = String
        anneUniver = String
        noteN = Decimal
        noteR = Decimal
        description_prof = String
        nb_inscrit = Integer
        prof_nom=String
        prof_prenom=String

#WsEtudiant.inscriptions = Array(WsInscription)

#***** des fonctions qui converti un model Django en model Soap
def toSemestre(sem):
    """"""
    return WsSemestre(idsem=sem.idsem)


def toProfesseur(prof):
    """"""
    wsprof=None
    if prof is None:
        wsprof=wsprof=WsProfesseur(cin ="None",
            code_emboche = -1,
            nom ="None",
            prenom = "None",
            ddn = "",
            email = "",
            adresse = "",
            telephone = "",
            description = "",
            mdp = "")
    else:
        wsprof=WsProfesseur(cin = prof.cin,
            code_emboche = prof.code_emboche,
            nom = prof.nom,
            prenom = prof.prenom,
            ddn = str(prof.ddn),
            email = prof.email,
            adresse = prof.adresse,
            telephone = prof.telephone,
            description = prof.description,
            mdp = "")
    return wsprof

def toEtudiant(etd):
    """"""
    if etd is None:
        wsetd=WsEtudiant(cin = "None",
            cne = -1,
            num_inscription = -1,
            nom = "",
            prenom = "",
            ddn = "",
            date_ajt = "",
            email = "",
            adresse = "",
            telephone = "",
            typeLicence = "",
            anneUniver = "",
            orderAdmis = -1,
            description = "",
            mdp = "")
    else:
        wsetd=WsEtudiant(cin = str(etd.cin),
            cne = etd.cne,
            num_inscription = etd.num_inscription,
            nom = str(etd.nom),
            prenom = str(etd.prenom),
            ddn = str(etd.ddn),
            date_ajt = str(etd.date_ajt),
            email = str(etd.email),
            adresse = str(etd.adresse),
            telephone = str(etd.telephone),
            typeLicence = str(etd.typeLicence),
            anneUniver = str(etd.anneUniver),
            orderAdmis = etd.orderAdmis,
            description = str(etd.description),
            mdp = etd.mdp)
    return wsetd
    #date d'ajout, par défaut c'est la date système, mais ne se modifier pas quand l'objet modifié.

def toModule(mod):
    """"""
    mdl=WsModule(idm = mod.idm,
                nom = mod.nom,
                description = mod.description,
                semestre = mod.semestre.idsem,
                prof = toProfesseur(mod.prof), #on stocke ici le nom et prenom
                idm_eq = "" if mod.module_eq is None else mod.module_eq.idm)
    return mdl
    
    
def toInscription(inscr,prf_nom="",prf_prenom=""):
    """"""
    inscrip=WsInscription(cne_etudiant = str(inscr.etudiant.cne),
                          id_m = inscr.module.idm,
                          nom_module = inscr.module.nom,
                          semestre = inscr.module.semestre.idsem,
                          anneUniver = inscr.anneUniver,
                          noteN = inscr.noteN,
                          noteR = inscr.noteR,
                          description_prof = inscr.description_prof,
                          nb_inscrit = inscr.nb_inscrit,
                          prof_nom=prf_nom,
                          prof_prenom=prf_prenom)
    return inscrip