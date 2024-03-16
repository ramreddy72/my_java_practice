package Technical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortHashMapByValueTop2Results {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("abc", "ram", "CDE", "DEG", "EGG", "FOX", "abc", "abc", "CDE", "ram", "FOX");
       
        Map<String, Long> map =  list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                System.out.println(map);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(2)
                .forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));


        // map.entrySet().stream()
        //         .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
        //         .limit(2)
        //         .forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));
        
    }
}
