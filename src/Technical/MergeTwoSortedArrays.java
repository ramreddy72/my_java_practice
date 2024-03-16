package Technical;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 1, 4, 7 };
        // int[] arr2 = { 4, 3, 9, 6, 8 };
        System.out.println(Arrays.toString(sortArray(arr1)));
    }
    
    public static int[] sortArray(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
