package Technical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram", "reddy", "aarushi", "swecha");

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	}
}
