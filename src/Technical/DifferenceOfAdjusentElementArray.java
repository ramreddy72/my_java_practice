package Technical;

import java.util.Arrays;

public class DifferenceOfAdjusentElementArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5 };

        System.out.println(findElementDifference(arr));

        int diff = Arrays.stream(arr).reduce( (a, b) -> a-b).orElse(0);
        System.out.println(diff);

        int[] numbers = { 10, 25, 30, 45, 50 };
        // System.out.println("Differences between adjacent elements:");
        //  Arrays.stream(numbers)
        //       .skip(1) // Skip the first element since it doesn't have a previous element to calculate difference
        //       .mapToObj()
        //       .forEach(System.out::println);
              

    }

    public static int findElementDifference(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else if(arr.length == 0){
            System.out.println("array is empty");
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    newArr[i] = arr[i] - arr[i + 1];
                } else {
                    newArr[i] = arr[i +1] - arr[i];
                }
            }
            System.out.println(Arrays.toString(newArr));
            return findElementDifference(newArr);
        }
        return 0;
    }
}
