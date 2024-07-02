package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi");

        String str = strings.stream().collect(Collectors.joining("-"));

        System.out.println(str);

         Map<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", "30");
        map.put("city", "New York");

        String ss = map.entrySet().stream()
                        .map(entry -> entry.getKey() +"=" +entry.getValue())
                .collect(Collectors.joining(","));
        System.out.println(ss);

         // Use Stream API to concatenate key-value pairs with "@"
        // String result = map.entrySet().stream()
        //         .map(entry -> "@" + entry.getKey() + "=" + entry.getValue())
        //         .collect(StringJoiner::new, StringJoiner::add, StringJoiner::merge)
        //         .toString();

        // Print the concatenated string
        System.out.println(ss);
    }
}
