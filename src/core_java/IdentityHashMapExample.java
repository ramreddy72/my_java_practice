package core_java;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Create an IdentityHashMap
        Map<Integer, String> identityMap = new IdentityHashMap<>();

        // Add elements to the map
        Integer key1 = new Integer(1);
        Integer key2 = new Integer(1);
        identityMap.put(key1, "Value 1");
        identityMap.put(key2, "Value 2");

        // Size of the map
        System.out.println("Size of IdentityHashMap: " + identityMap.size()); // Output: 2

        // Since key1 and key2 are different objects, they are considered distinct keys
        // even though their contents are equal
        System.out.println("Contains key1? " + identityMap.containsKey(key1)); // Output: true
        System.out.println("Contains key2? " + identityMap.containsKey(key2)); // Output: true

        // Print the values corresponding to keys
        System.out.println("Value for key1: " + identityMap.get(key1)); // Output: Value 1
        System.out.println("Value for key2: " + identityMap.get(key2)); // Output: Value 2
    }
}
