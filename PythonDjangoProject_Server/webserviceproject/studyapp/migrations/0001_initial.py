# -*- coding: utf-8 -*-
# Generated by Django 1.9.4 on 2016-03-23 22:43
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Etudiant',
            fields=[
                ('cin', models.CharField(max_length=10, unique=True)),
                ('cne', models.PositiveIntegerField(primary_key=True, serialize=False)),
                ('num_inscription', models.PositiveIntegerField(unique=True, verbose_name='N inscription')),
                ('nom', models.CharField(max_length=100)),
                ('prenom', models.CharField(max_length=100)),
                ('ddn', models.DateField(verbose_name='Date de naissance')),
                ('date_ajt', models.DateField(auto_now_add=True, verbose_name="Date d'ajout")),
                ('email', models.EmailField(max_length=300)),
                ('adresse', models.TextField()),
                ('telephone', models.CharField(max_length=15)),
                ('typeLicence', models.CharField(max_length=100)),
                ('anneUniver', models.CharField(max_length=12, verbose_name='annee universitaire')),
                ('orderAdmis', models.PositiveIntegerField()),
                ('description', models.TextField(blank=True)),
                ('mdp', models.CharField(max_length=50)),
            ],
            options={
                'verbose_name': 'Etudiant',
                'verbose_name_plural': 'Etudiants',
            },
        ),
        migrations.CreateModel(
            name='Inscription',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('anneUniver', models.PositiveIntegerField(verbose_name='Ann\xe9e universitaire')),
                ('noteN', models.DecimalField(blank=True, decimal_places=3, max_digits=5, null=True, verbose_name='note normale')),
                ('noteR', models.DecimalField(blank=True, decimal_places=3, max_digits=5, null=True, verbose_name='note ratrappage')),
                ('description_prof', models.TextField(blank=True)),
                ('nb_inscrit', models.PositiveIntegerField()),
                ('etudiant', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='studyapp.Etudiant')),
            ],
        ),
        migrations.CreateModel(
            name='Module',
            fields=[
                ('idm', models.CharField(max_length=3, primary_key=True, serialize=False)),
                ('nom', models.CharField(max_length=100)),
                ('description', models.TextField(blank=True)),
                ('module_eq', models.ForeignKey(blank=True, null=True, on_delete=django.db.models.deletion.SET_NULL, to='studyapp.Module', verbose_name='Module equivalant')),
            ],
            options={
                'verbose_name': 'Module',
                'verbose_name_plural': 'Modules',
            },
        ),
        migrations.CreateModel(
            name='Professeur',
            fields=[
                ('cin', models.CharField(max_length=10, unique=True)),
                ('code_emboche', models.PositiveIntegerField(primary_key=True, serialize=False, verbose_name="Code d'emboche")),
                ('nom', models.CharField(max_length=100)),
                ('prenom', models.CharField(max_length=100)),
                ('ddn', models.DateField(verbose_name="Date de naissance de l'etudiant")),
                ('email', models.EmailField(max_length=300)),
                ('adresse', models.TextField()),
                ('telephone', models.CharField(max_length=15)),
                ('description', models.TextField(blank=True)),
                ('mdp', models.CharField(max_length=50)),
            ],
            options={
                'verbose_name': 'Prof\xe9sseur',
                'verbose_name_plural': 'Prof\xe9sseurs',
            },
        ),
        migrations.CreateModel(
            name='Semestre',
            fields=[
                ('idsem', models.CharField(max_length=3, primary_key=True, serialize=False, verbose_name='id semestre')),
            ],
            options={
                'verbose_name': 'Semestre',
                'verbose_name_plural': 'Semestres',
            },
        ),
        migrations.AddField(
            model_name='module',
            name='prof',
            field=models.ForeignKey(blank=True, null=True, on_delete=django.db.models.deletion.SET_NULL, to='studyapp.Professeur', verbose_name='Professeur'),
        ),
        migrations.AddField(
            model_name='module',
            name='semestre',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='studyapp.Semestre'),
        ),
        migrations.AddField(
            model_name='inscription',
            name='module',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='studyapp.Module'),
        ),
        migrations.AddField(
            model_name='etudiant',
            name='modules',
            field=models.ManyToManyField(through='studyapp.Inscription', to='studyapp.Module'),
        ),
    ]
