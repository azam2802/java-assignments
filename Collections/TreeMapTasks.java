package Collections;

import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "World");
        map.put(2, "Ait");
        map.put(3, "Everyone");
        System.out.println(map);

        // 26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println(map.ceilingKey(2));

        // 25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
        System.out.println(map.ceilingEntry(2));

        // 24. Write a Java program to get a portion of a map whose keys are greater than a given key.
        System.out.println(map.tailMap(2, false));

        // 23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        System.out.println(map.tailMap(2));

        // 22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
        System.out.println(map.subMap(1, true, 3, true));

        // 21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
        System.out.println(map.subMap(1, true, 3, false));
    }   
}
