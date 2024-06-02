package Technical;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestSubstringRepeatingMore {
    public static void main(String[] args) {
        String str = "aabbbaa";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                list.add(str.substring(i, j + 1));
            }
        }

        System.out.println(list);

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        String longestRepeatedString = map
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1 && e.getKey().length() > 1)
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .orElse("");

        System.out.println(longestRepeatedString);

        // String otherWay = str.codePoints()
        //         .mapToObj(cp -> String.valueOf((char) cp)) // Convert code points to strings
        //         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        //         .entrySet().stream()
        //         .filter(entry -> entry.getValue() > 1)
        //         .max(Map.Entry.comparingByKey())
        //         .map(Map.Entry::getKey)
        //         .orElse("");

        // System.out.println(otherWay);
    }
}
