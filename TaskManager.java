// Cette classe permet de stocker et exécuter les tâches.
import java.util.LinkedList;
import java.util.Queue;

// ces imports serviront à implémenter le FIFO
public class TaskManager{
    private Queue<Task> taskQueue; // Ma file d'attente pour les tâches

// mon constructeur 
    public TaskManager(){
        taskQueue= new LinkedList<>(); // créé une nouvelle liste chainée vide 
    }

    // Méthode pour ajouter une tâche à ma file 
    public void addTask(Task t ){
        taskQueue.add(t);
    }
    // Méthode pour exécuter les tâches FIFO

    public void executeTasks(){
        while (!taskQueue.isEmpty()){ // vérifie si la file d'attente est vide 
            Task t = taskQueue.poll(); // retire et renvoie la première tâche de la file d'attente (FIFO)
            System.out.println("execution de la tâche"+ t.getId() + "pendant" + t.getDuration()+"unités de temps.");

        }
    }

}