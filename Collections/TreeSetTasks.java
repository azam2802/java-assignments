package Collections;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(32);
        set.add(23);
        set.add(54);
        set.add(76);
        set.add(87);
        set.add(20);
        System.out.println(set);

        // 16. Write a Java program to remove a given element from a tree set.
        set.remove(23);
        System.out.println(set);

        // 15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("15: "+set.pollLast());

        // 14. Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("14: "+set.pollFirst());

        // 13. Write a Java program to get an element in a tree set that has a lower value than the given element.
        System.out.println("13: "+set.lower(87));

        // 12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
        System.out.println("12: "+set.higher(23));

        // 11. Write a Java program to get the element in a tree set less than or equal to the given element.
        System.out.println("11: "+set.floor(87));
    }
}
