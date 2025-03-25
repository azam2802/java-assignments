package TaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks

        Task code_review = new Task("Code Review", 3, 20);
        Task database_backup = new Task("Database Backup", 2, 30);
        scheduler.addTask(code_review);
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(database_backup);
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        // Print all tasks
        scheduler.printAllTasks();

        // Process a task
        scheduler.processTask();

        // Delay a task
        scheduler.delayTask(new Task("Task 2", 2, 3));

        // Print all tasks again
        scheduler.printAllTasks();

        // Delay a task
        scheduler.delayTask(database_backup);

        // Print all tasks again
        scheduler.printAllTasks();

        // Process a task
        scheduler.processTask();

        // Print all tasks again
        scheduler.printAllTasks();

        // Process a task
        scheduler.processTask();

        // Print all tasks again
        scheduler.printAllTasks();
    }
}
