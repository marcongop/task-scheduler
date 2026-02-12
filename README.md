# TaskScheduler

## Description

TaskScheduler est un petit projet Java qui simule un **ordonnanceur de tâches**.  
Il permet de gérer et d’exécuter des tâches selon différents algorithmes d’ordonnancement :

- **FIFO (First In, First Out)** : premier arrivé, premier servi  
- **Priorité** : les tâches avec la priorité la plus haute s’exécutent en premier  
- **Round Robin** : chaque tâche reçoit un quantum de temps, puis retourne en fin de file si elle n’est pas terminée  

Le projet est destiné à illustrer le fonctionnement des systèmes multitâches et la gestion de files d’attente en Java.

---

## Structure du projet

- `Task.java` : classe représentant une tâche (id, durée, priorité)  
- `TaskManager.java` : gestionnaire de tâches (FIFO, priorité, Round Robin)  
- `Main.java` : programme principal pour tester l’exécution des tâches  

---