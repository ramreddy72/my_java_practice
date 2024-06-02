package Technical;

import java.util.Arrays;

public class SumOfSmallElementstoLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 11, 2, 6 };

        int max = Arrays.stream(arr).max().orElse(0);

        int sum = Arrays.stream(arr).filter(n -> n != max).sum();

        System.out.println(max + " "+ sum);

        if (sum == max) {
            System.out.println("");
        } else {
            System.out.println("false");
        }
    }
}
