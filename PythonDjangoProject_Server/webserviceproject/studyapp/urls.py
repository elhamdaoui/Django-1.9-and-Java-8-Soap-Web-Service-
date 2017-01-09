# -*- coding: utf-8 -*-
"""
Created on Thu Mar 12 11:08:13 2016

@author: abdelmajid
"""


from django.conf.urls import url #, include 
#from django.contrib import admin
from studyapp import views as viewsStudyApp

urlpatterns =[
url(r'^accueil/$', viewsStudyApp.accueil,name="Accueil"),
url(r'^etudiants/$', viewsStudyApp.tous_etudiants,name="tous_etudiants"),
url(r'^etudiantws/$', viewsStudyApp.etudiant_service),
url(r'^etudiantws/service.wsdl', viewsStudyApp.etudiant_service),
]