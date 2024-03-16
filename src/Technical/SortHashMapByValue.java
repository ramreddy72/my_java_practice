package Technical;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

        System.out.println(scores);
        scores.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // String s1 = "abc";
        // String s2 = "abc";
        // System.out.println("s1 == s2 is:" + s1 == s2);

        // int x = 10 * 10 - 10;
   		
   		// System.out.println(x);
    }
}
