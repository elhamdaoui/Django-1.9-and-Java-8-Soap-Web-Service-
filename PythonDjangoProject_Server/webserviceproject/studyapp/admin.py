from django.contrib import admin
from studyapp.models import Etudiant,Semestre,Module,Professeur,Inscription

# Register your models here.
#@admin.register(Etudiant,Semestre,Module,Professeur,Inscription)

class EtudiantAdmin(admin.ModelAdmin):
    list_display = ('cne', 'cin','nom','num_inscription','prenom','email','date_ajt')#ce qui va afficher dans l'administration
    search_fields = ('nom','cne')#champ de recherche
    

class SemestreAdmin(admin.ModelAdmin):
    list_display = ('idsem',)
    search_fields = ('idsem',)#champ de recherche

class ModuleAdmin(admin.ModelAdmin):
    list_display = ('idm', 'nom','semestre','prof','module_eq')
    search_fields = ('nom','idm')#champ de recherche
    list_filter = ('semestre',)#filtrage les modules par semstre.

class ProfesseurAdmin(admin.ModelAdmin):
    list_display = ('code_emboche', 'cin','nom','prenom','email','telephone')
    search_fields = ('nom','telephone')#champ de recherche

class InscriptionAdmin(admin.ModelAdmin):
    list_display = ('etudiant', 'module','anneUniver','noteN','noteR','nb_inscrit')
    search_fields = ('etudiant', 'module')#champ de recherche
    list_filter = ('etudiant',)

admin.site.register(Etudiant, EtudiantAdmin)
admin.site.register(Semestre, SemestreAdmin)
admin.site.register(Module, ModuleAdmin)
admin.site.register(Professeur, ProfesseurAdmin)
admin.site.register(Inscription, InscriptionAdmin)
