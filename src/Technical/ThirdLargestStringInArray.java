package Technical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdLargestStringInArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram", "reddy", "palnati", "ab", "hydd");
        int nthElement = 3;

        list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(nthElement).skip(nthElement-1).forEach(System.out::println);
    }
}
