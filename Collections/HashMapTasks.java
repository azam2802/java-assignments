package Collections;

import java.util.HashMap;

public class HashMapTasks {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Hello", "World");
        map.put("hello", "Ait");
        map.put("Hi", "Everyone");
        
        // 12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("Collection view is: "+ map.values());

        // 11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println(map.keySet());

        // 10. Write a Java program to get the value of a specified key in a map.
        System.out.println(map.get("Hi"));

        // 9. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println(map.entrySet());

        // 8. Write a Java program to test if a map contains a mapping for the specified value.
        String search = "Ait";
        if (map.containsValue(search)) {
            System.out.println(search + " value found in map");
        } else {
            System.out.println(search + " value not found in map");
        }

        // 7. Write a Java program to test if a map contains a mapping for the specified key.
        String searchKey = "Hi";

        if (map.containsKey(searchKey)) {
            System.out.println(searchKey + " key found in map");
        } else {
            System.out.println(searchKey + " key not found in map");
        }

    }
}
