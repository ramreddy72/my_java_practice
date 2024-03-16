package Technical;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };

        OptionalInt max = Arrays.stream(arr).max();

        System.out.println(max.getAsInt());
    }
}
