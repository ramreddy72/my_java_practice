package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateFromStream {
    public static void main(String[] args) {
        // Using Streams
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        long count = java.util.Arrays.stream(numbers).distinct().count();
        System.out.println("Count of distinct numbers: " + count);

        Arrays.stream(numbers).boxed().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
