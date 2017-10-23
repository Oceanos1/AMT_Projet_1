# Un navigateur de "Programmes" multi-tiers

## Introduction

Ce repo contient notre projet élaboré dans le cadre du cours AMT du semestre 5 d'informatique logicielle à la HEIG-VD. Il permet à un utilisateur de naviguer page par page une table de tous les "programmes" disponibles dans la base de données. Il est implémenté avec le modèle MVC.

## Déploiement
La commande `docker-compose up --build`va automatiquement déployer le WAR dans le container Wildfly, ainsi que créer la base de données et gérer la connection à celle ci. L'application sera accessible sur le port `9090` à l'adresse `/AMT_Programs/home`.
Sous Windows, par défaut, celà correspond à:

http://192.168.99.100:9090/AMT_Programs/home

## Auteurs
* **Edward Ransome** 
* **Michael Spierer**
