package streams;

import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharInString {

    public static void main(String[] args) {
        String str = "ramreddy";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

        // Map<Character, Long> map2 =  str.chars().mapToObj(c-> (char)c)
        //     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
    
}
