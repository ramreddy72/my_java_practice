package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get a Spliterator from the list
        Spliterator<Integer> spliterator = numbers.spliterator();

        // Iterate over elements using tryAdvance() method
        System.out.println("Elements:");
        spliterator.forEachRemaining(System.out::println);
    }
}
