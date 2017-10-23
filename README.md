# Un navigateur de "Programmes" multi-tiers

## Introduction

Ce repo contient notre projet élaboré dans le cadre du cours AMT du semestre 5 d'informatique logicielle à la HEIG-VD. Il permet à un utilisateur de naviguer page par page une table de tous les "programmes" disponibles dans la base de données. Il est implémenté avec le modèle MVC.

## Structure
Le projet consiste en trois containers Docker:
- Wildfly
- Phpmyadmin
- Mysql

Au lancement, la base de données est créée avec un script par le container Mysql. De même, le .WAR de notre projet Java EE est automatiquement déployé dans le container Wildfly, ainsi que le driver Mysql-connector.
Le projet Java EE est implémenté avec le modèle MVC: La vue, le fichier .jsp, est ce que voit l'utilisateur: il affiche simplement les données fournies par le servlet et envoie des requêtes POST à celui-ci quand l'utilisateur souhaite modifier la liste de programmes. Les servlets permettent de gérer les requêtes POST et GET pour transmettre les informations entre le fichier .jsp et l'EJB. L'EJB, lui, manipule directement la base de données et les objets du modèle (des objets "programmes", composés d'une ID, un language, un type et une version).

## Déploiement
La commande `docker-compose up --build` depuis le dossier `topology-amt/` contenant le `docker-compose.yml` va automatiquement déployer le WAR dans le container Wildfly, ainsi que créer la base de données et gérer la connection à celle ci. L'application sera accessible sur le port `9090` à l'adresse `/AMT_Programs/home`.
Sous Windows, par défaut, celà correspond à:

http://192.168.99.100:9090/AMT_Programs/home

## Notes
Le projet étant basé sur l'exemple AMT topology du cours, ainsi que le RESTDemoApp des Webcasts, certains fichiers ou chemins de ces projets restent dans ce projet.

## Auteurs
* **Edward Ransome** 
* **Michael Spierer**
