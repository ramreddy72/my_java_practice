package Technical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
     public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if the lengths are equal
        if (str1.length() != str2.length())
            return false;
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        checkMapEquals();
    }
    
    public static void checkMapEquals() {
        // Create two HashMaps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 2);
        map2.put("c", 3);
        map2.put("d", 3);


        // Check if the maps are equal
        boolean areEqual = map1.equals(map2);

        System.out.println("Are the maps equal? " + areEqual);
    }
}
