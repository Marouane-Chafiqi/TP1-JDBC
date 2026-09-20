# TP1 

## Description

Ce TP a pour objectif de se connecter a une base de donnees MySQL depuis un programme Java via JDBC, de creer et remplir une table, puis de produire des statistiques SQL (MAX, SUM, GROUP BY, ORDER BY) en utilisant Statement et PreparedStatement.

## Objectifs

- Se connecter a MySQL via JDBC
- Creer et manipuler une table SQL depuis Java
- Utiliser Statement et PreparedStatement
- Produire des statistiques avec GROUP BY, MAX, SUM, ORDER BY

## Prerequis

- MySQL installe (Workbench ou ligne de commande)
- JDK installe
- IntelliJ IDEA (ou autre IDE Java)
- Driver JDBC MySQL (mysql-connector-j-x.x.x.jar)

## Preparation de la base de donnees

Executer dans MySQL :

```sql
CREATE DATABASE IF NOT EXISTS atelier;
```

## Configuration du projet

1. Ajouter le fichier mysql-connector-j-x.x.x.jar comme librairie du projet (File > Project Structure > Libraries).
2. Ouvrir le fichier ExoJDBC.java.
3. Adapter les valeurs USER et PASSWORD selon votre configuration MySQL.

## Execution

Lancer la classe ExoJDBC.

Le programme :
- Se connecte a la base atelier
- Cree la table DevData
- Insere des donnees de test
- Affiche 4 statistiques :
  - Nombre maximum de scripts par jour
  - Classement des developpeurs par total de scripts
  - Total de scripts sur la semaine
  - Total de scripts pour un developpeur donne (PreparedStatement)

## Resultat attendu

```
Connexion MySQL OK.
Table creee + donnees inserees.

--- Max scripts par jour ---
Lundi | WAFI | 2
Mardi | SLAMI | 9
Mercredi | SLAMI | 2

--- Classement des developpeurs (total scripts) ---
SLAMI | 11
WAFI | 6
ALAMI | 4

--- Total scripts semaine ---
Total semaine : 21

--- Total scripts pour un developpeur (PreparedStatement) ---
Total pour ALAMI : 4
```

## Captures d'ecran

Voir le dossier screenshots/ pour les captures montrant :
- La base atelier dans MySQL Workbench
- L'execution du programme dans IntelliJ avec les resultats




https://github.com/user-attachments/assets/82efbe32-1104-4628-aa11-96dfe7c7ce1f



