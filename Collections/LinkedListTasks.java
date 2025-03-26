package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTasks {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();

        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        arr.add("Programming");
        arr.add("Collections");
        arr.add("ArrayList");
        System.out.println("\n");

        // 26. Write a Java program to replace an element in a linked list.
        arr.set(1, "AIT");
        System.out.println(arr);

        // 25. Write a Java program to check if a linked list is empty or not.
        System.out.println(arr.isEmpty() ? "Array is empty" : "Array is NOT empty");

        // 24. Write a Java program to compare two linked lists.
        LinkedList<String> arr2 = new LinkedList<String>();
        arr2.add("Hello");
        arr2.add("World");
        arr2.add("Java");
        arr2.add("Programming");
        arr2.add("Collections");
        arr2.add("ArrayList");
        Boolean areEqual = true;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() != arr2.size()) {
                areEqual = false;
                break;
            }
            if (!arr2.contains(arr.get(i))) {
                areEqual = false;
                break;
            }
        }
        System.out.println("Arr and Arr2 equal: " + areEqual);

        // 23. Write a Java program to convert a linked list to an array list.
        List<String> arraylist = new ArrayList<String>(arr);
        System.out.println(arraylist instanceof ArrayList);

        // 22. Write a Java program to check if a particular element exists in a linked list.
        String s = "AIT";
        System.out.println(arr.contains(s));

        // 21. Write a Java program to retrieve, but not remove, the last element of a linked list.
        System.out.println(arr.peekLast());

    }
}
