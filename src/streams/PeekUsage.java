package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekUsage {
    public static void main(String[] args) {
        int[] numbers = {1,1, 3, 2, 4, 3};

        // Arrays.stream(numbers)
        //     .peek(n -> System.out.println("Original: " + n)) // Peek to print original elements
        //     .map(n -> n * 2) // Perform mapping operation
        //     .peek(n -> System.out.println("Doubled: " + n)) // Peek to print doubled elements
        //     .filter(n -> n % 2 == 0) // Perform filtering operation
        //     .peek(n -> System.out.println("Filtered: " + n)) // Peek to print filtered elements
        //     .forEach(System.out::println); // Terminal operation

        Arrays.stream(numbers)
                .peek(System.out::print)
                .limit(3)
                .distinct()
                .forEach(System.out::print);

        List<String> list = Arrays.asList("ram", "abc", "bcd");

        list.stream().filter(Objects::isNull)
                    .map(String::toUpperCase)
                    .forEach(System.out::println); 
    }
}
