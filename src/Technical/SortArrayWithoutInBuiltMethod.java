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

        //this is called bubble sort
        //time complexity O(n^2)

        System.out.println(Arrays.toString(arr));

        //Sort List of String without inbuilt methods
        String[] list = { "ram", "reddy", "abc", "ball", "zebra" };
        
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println(Arrays.asList(list));

    }
}
