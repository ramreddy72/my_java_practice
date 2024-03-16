package streams;

import java.util.List;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of numbers is: " + sum);
        
        // Using Streams
        int sumOfNumbers = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers is: " + sumOfNumbers);

        List<Integer> list = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sumOfNumbersList = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers is: " + sumOfNumbersList);
        
    }
}
