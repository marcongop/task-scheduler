public class Task {
    private int id; // id de la tâche 
    private int duration ;// La durée de la tâches (en unités de temps)
    private int priority;

// mon constructeur
    public Task(int id, int duration, int priority) {
        this.id= id;
        this.duration= duration;
        this.priority= priority;
    }

// getters
    public int getId(){
        return id;
    }
    public int getDuration(){
        return duration;
    }
    public int getPriority(){
        return priority;
    }
// Ma classe permet de définir une tâche avec un identifiant, une durée et une priorité.


}