public class Main{
    public static void main(String[] args) {
        TaskManager manager= new TaskManager();

        // Création de tâches
        Task t1 = new Task(1,5,2);
        Task t2 = new Task(2,3,1);
        Task t3= new Task(3,4,3);

        // Ajout au manager 
        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        // Execution 
        manager.executeTasks();
        
    }
}