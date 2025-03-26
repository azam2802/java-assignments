package Collections;

import java.util.ArrayList;

public class ArrayListTasks {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        arr.add("Programming");
        arr.add("Collections");
        arr.add("ArrayList");
        
        // 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        String specifiedString = "AIT";
        arr.set(1, specifiedString);
        System.out.println(arr.toString());

        // 20. Write a Java program to increase an array list size.
        arr.ensureCapacity(10);
        arr.add(6, "Apple");
        System.out.println(arr.toString() + " " + arr.size());

        // 19. Write a Java program for trimming the capacity of an array list.
        arr.trimToSize();

        // 18. Write a Java program to test whether an array list is empty or not.
        System.out.println(arr.isEmpty() ? "Array is empty" : "Array is NOT empty");

        // 17. Write a Java program to empty an array list.
        arr.clear();
        System.out.println(arr);

    }
}
