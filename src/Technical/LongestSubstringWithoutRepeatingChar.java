package Technical;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


//Longest Substring Without Repeating Characters
/*Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {
        String str = "cjfwqewadcebneazmkkxynquhmqudwghhlgascavggytkyswidvislcczswfqemaquaizaffgdzsdtqnwlvrzxt";

        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {
        if (str.isEmpty())
            return 0;
        List<String> list = new ArrayList<>();
        int len = str.length();
        //This loop maintains the starting character  
        for (int i = 0; i < len; i++) {
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for (int j = i; j < len; j++) {
                String s = str.substring(i, j + 1);
                list.add(s);
            }
        }
        System.out.println(list);

        //Collect list of strings to map with Java 8 Stream API
        Map<String, Integer> map = list.stream().distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(map);

         return 
                map.entrySet().parallelStream()
                .filter(e -> isRepeatedChar(e.getKey()))                 
                .max(Map.Entry.comparingByValue()).get().getValue().intValue();
    }

    
    public static boolean isRepeatedChar(String str) {

        // return str != "ramr";
       return !str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue()>1 )
        .map(e -> e.getKey())
               .findAny().isPresent();
    }
}
