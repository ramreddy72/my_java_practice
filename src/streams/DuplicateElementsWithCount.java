package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithCount {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "AA");

        Map<String,Long> namesCount = list.stream().filter(x -> Collections.frequency(list, x) >1)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                
        System.out.println(namesCount);
    }
}
