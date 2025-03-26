package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class HashSetTasks {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Java");
        set.add("Hello");
        set.add("World");
        set.add("Programming");
        set.add("arrayList");
        set.add("Collections");

        // 12. Write a Java program to remove all elements from a set set.
        set.clear();
        System.out.println(set);
        set.add("Java");
        set.add("Hello");
        set.add("World");
        set.add("Programming");
        set.add("arrayList");
        set.add("Collections");

        // 11. Write a Java program to compare two sets and retain elements that are the
        // same.
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Java");
        set2.add("Hello");
        set2.add("World");
        set2.add("Programming");
        set2.add("arrayList");
        set2.add("Collections");
        set2.retainAll(set);
        System.out.println(set2);

        // 10. Write a Java program to compare two set set.
        System.out.println(set2.equals(set));

        // 8. Write a Java program to convert a set set to a tree set.
        Set<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);

        // 7. Write a Java program to convert a set set to an array.
        ArrayList<String> ListFromSet = new ArrayList<String>(treeSet);
        System.out.println(ListFromSet);
    }
}
