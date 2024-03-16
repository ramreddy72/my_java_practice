package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is: " + min);

        // Using Streams
        int minNumber = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Minimum number is: " + minNumber);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int minNumberList = list.stream().min(Integer::compare).get();
        System.out.println("Minimum number is: " + minNumberList);

        Integer minNumberListComparator = list.stream()
                        .min(Comparator.comparing(Integer::valueOf))
                        .get();
        System.out.println("The Minimum number is: " + minNumberListComparator);
    }
}
