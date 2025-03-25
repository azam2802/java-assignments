package TaskScheduler;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    private PriorityQueue<Task> scheduledTasks;
    private ArrayDeque<Task> pendingTasks;
    private HashMap<Task, ArrayList<LocalDateTime>> completedTasks;

    public TaskScheduler() {
        scheduledTasks = new PriorityQueue<>();
        pendingTasks = new ArrayDeque<>();
        completedTasks = new HashMap<>();
    }

    public void addTask(Task task) {
        scheduledTasks.offer(task);
    }

    public void printAllTasks() {
        System.out.println("Scheduled Tasks (sorted by priority):");
        for (Task t : scheduledTasks) {
            System.out.println("["+t.getName()+"] Priority: "+t.getPriority()+" Duration: "+t.getDuration());
        }

        System.out.println("Pending Tasks (FIFO order):");
        for (Task t : pendingTasks) {
            System.out.println("["+t.getName()+"] Priority: "+t.getPriority()+" Duration: "+t.getDuration());
        }

        System.out.println("Completed Tasks:");
        for (Map.Entry<Task, ArrayList<LocalDateTime>> entry : completedTasks.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue().get(0) + " -> " + entry.getValue().get(1));
        }
    }

    public void delayTask(Task task) {
        pendingTasks.offer(task);
        scheduledTasks.remove(task);
        System.out.println("Task [" + task.getName() + "] delayed.");
    }

    public void processTask() {
        if (scheduledTasks.isEmpty()) {
            System.out.println("No tasks to process.");
        } else {
            Task t = scheduledTasks.poll();
            System.out.println("Processing task: [" + t.getName() + "] with priority " + t.getPriority()
                    + " and duration " + t.getDuration());
            completedTasks.put(t, new ArrayList<>(Arrays.asList(LocalDateTime.now(), LocalDateTime.now().plusMinutes(t.getDuration()))));
            return;
        }
        if (!pendingTasks.isEmpty()) {
            Task t = pendingTasks.poll();
            System.out.println("Processing delayed task: [" + t.getName() + "] with priority " + t.getPriority()
                    + " and duration " + t.getDuration());
        } else {
            System.out.println("No tasks to process.");
        }
    }
}