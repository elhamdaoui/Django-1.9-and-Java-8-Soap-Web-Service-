#-*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models

# Create your models here.

#********************définition du modèle Etudiant**********************
class Etudiant(models.Model):
    """
    """
    cin=models.CharField(max_length=10,unique=True)
    cne=models.PositiveIntegerField(primary_key=True)
    num_inscription=models.PositiveIntegerField(unique=True,verbose_name="N inscription")
    nom=models.CharField(max_length=100)
    prenom=models.CharField(max_length=100)
    ddn=models.DateField(auto_now=False, auto_now_add=False,verbose_name="Date de naissance")
    #date d'ajout, par défaut c'est la date système, mais ne se modifier pas quand l'objet modifié.
    date_ajt=models.DateField(auto_now=False,auto_now_add=True, verbose_name="Date d'ajout")
    email=models.EmailField(max_length=300)
    adresse=models.TextField()
    telephone=models.CharField(max_length=15)
    typeLicence=models.CharField(max_length=100)
    anneUniver=models.CharField(max_length=12,verbose_name="annee universitaire")
    orderAdmis=models.PositiveIntegerField()
    description=models.TextField(blank=True)
    mdp=models.CharField(max_length=50,verbose_name="Mot de passe")
    modules=models.ManyToManyField('Module',
                              through='Inscription',
                              through_fields=('etudiant', 'module'),
                              )
    #mise en forme
    class Meta:
        verbose_name = 'Etudiant'
        verbose_name_plural = 'Etudiants'
    
    def __unicode__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.nom)+" "+str(self.prenom)+", CNE:"+str(self.cne)+", CIN:"+str(self.cin)+", dat_ajt:"+str(self.date_ajt)
        
    def __str__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.nom)+" "+str(self.prenom)+", CNE:"+str(self.cne)+", CIN:"+str(self.cin)+", dat_ajt:"+str(self.date_ajt)
    
    
#********************définition du modèle Semestre**********************
class Semestre(models.Model):
    """
    """
    idsem=models.CharField(max_length=3,primary_key=True,verbose_name='id semestre')
    
    #mise en forme
    class Meta:
        verbose_name = 'Semestre'
        verbose_name_plural = 'Semestres'
    
    def __unicode__(self):
        """représentation sou forme d'une chaine de caractère"""
        return "Semestre "+str(self.idsem)
        
    def __str__(self):
        """représentation sou forme d'une chaine de caractère"""
        return "Semestre "+str(self.idsem)
    


#********************définition du modèle Module**********************
class Module(models.Model):
    """
    """
    idm=models.CharField(max_length=3,primary_key=True)
    nom=models.CharField(max_length=100)
    description=models.TextField(blank=True)
    semestre=models.ForeignKey('Semestre',on_delete=models.CASCADE)
    prof=models.ForeignKey('Professeur',on_delete=models.SET_NULL,blank=True,null=True,verbose_name="Professeur")
    module_eq=models.ForeignKey('Module',on_delete=models.SET_NULL,blank=True,null=True,verbose_name="Module equivalant")
    
    class Meta:
        verbose_name = 'Module'
        verbose_name_plural = 'Modules'
    
    def __unicode__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.idm)+": "+str(self.nom)+", de semestre "+str(self.semestre.idsem)+""+(", "+str(self.prof.nom)+" "+str(self.prof.prenom) if self.prof is not None else "")
        
    def __str__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.idm)+": "+str(self.nom)+", de semestre "+str(self.semestre.idsem)+""+(", "+str(self.prof.nom)+" "+str(self.prof.prenom) if self.prof is not None else "")
 

#********************définition du modèle Profésseur**********************   
class Professeur(models.Model):
    """
    """
    cin=models.CharField(max_length=10,unique=True)
    code_emboche=models.PositiveIntegerField(primary_key=True,verbose_name="Code d'emboche")
    nom=models.CharField(max_length=100)
    prenom=models.CharField(max_length=100)
    ddn=models.DateField(auto_now=False, auto_now_add=False,verbose_name="Date de naissance de l'etudiant")
    email=models.EmailField(max_length=300)
    adresse=models.TextField()
    telephone=models.CharField(max_length=15)
    description=models.TextField(blank=True)
    mdp=models.CharField(max_length=50,verbose_name="Mot de passe")
    #mise en forme
    class Meta:
        verbose_name = 'Profésseur'
        verbose_name_plural = 'Profésseurs'
    
    def __unicode__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.nom)+" "+str(self.prenom)+", code:"+str(self.code_emboche)+", CIN:"+str(self.cin)
        
    def __str__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.nom)+" "+str(self.prenom)+", code:"+str(self.code_emboche)+", CIN:"+str(self.cin)
    

    
#********************définition du modèle Inscription********************** 
class Inscription(models.Model):
    """
    """
    etudiant = models.ForeignKey('Etudiant', on_delete=models.CASCADE)
    module = models.ForeignKey('Module', on_delete=models.CASCADE)
    anneUniver=models.CharField(max_length=12,verbose_name="Année universitaire")
    noteN=models.DecimalField(max_digits=5, decimal_places=3,null=True,blank=True,verbose_name="note normale")
    noteR=models.DecimalField(max_digits=5, decimal_places=3,null=True,blank=True,verbose_name="note ratrappage")
    description_prof=models.TextField(blank=True)
    nb_inscrit=models.PositiveIntegerField(default=1)
    valide=models.PositiveIntegerField(default=0)#1 si le module est validé par le responsable, 0 sinon.(situation, ou inscription actuelle)
    
    def __unicode__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.etudiant.cne)+" "+str(self.module.idm)+", anne univésitaire:"+str(self.anneUniver)+", note N:"+str(self.noteN)+", note R:"+str(self.noteR)+", nbr Ins:"+str(self.nb_inscrit)
        
    def __str__(self):
        """représentation sou forme d'une chaine de caractère"""
        return str(self.etudiant.cne)+" "+str(self.module.idm)+", anne univésitaire:"+str(self.anneUniver)+", note N:"+str(self.noteN)+", note R:"+str(self.noteR)+", nbr Ins:"+str(self.nb_inscrit)
        
    
