package Technical;

import java.util.Arrays;

public class SortArrayWithoutInBuiltMethod {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 52, 2 };


        // Using two for loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
