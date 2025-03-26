package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());

        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        queue.add("Programming");
        queue.add("Collections");
        queue.add("queue");

        System.out.println(queue);

        // 11. Write a Java program to convert a Priority Queue element to string
        // representations.
        System.out.println(queue.toString());

        // 10. Write a Java program to convert a priority queue to an array containing
        // all its elements.
        String[] arr = new String[queue.size()];
        queue.toArray(arr);
        System.out.println(arr);

        List<String> arr2 = new ArrayList<String>(queue);
        System.out.println(arr2);

        // 9. Write a Java program to retrieve and remove the first element.
        System.out.println(queue.poll());

        // 8. Write a Java program to retrieve the first element of the priority queue.
        System.out.println(queue.peek());

        // 7. Write a Java program to compare two priority queues.
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Hello");
        queue2.add("World");
        queue2.add("Java");
        queue2.add("Programming");
        System.out.println(queue.equals(queue2));

        // 12. Write a Java program to change priorityQueue to maximum priority queue.
        String val = null;
        while ((val = queue.poll()) != null) {
            System.out.print(val + "  ");
        }
    }
}