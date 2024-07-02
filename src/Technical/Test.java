package Technical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram", "reddy", "aarushi", "swecha");

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);


        // int i = 9;
        // int j = 09;

        List<List<Integer>> li = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        
        li.stream().flatMap(ls -> ls.stream()).collect(Collectors.toList()).forEach(System.out::println);


	}
}
