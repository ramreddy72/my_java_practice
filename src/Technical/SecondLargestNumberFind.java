package Technical;

public class SecondLargestNumberFind {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 6, 7, 8 };
        int n = arr.length;
        print2Largest(arr, n);
        findSecondHighest(arr);
    }

    public static void print2Largest(int[] arr, int arr_size) {
        int i, second;
        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for (i = 0; i < arr_size; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Find the second largest element
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("The second largest " +
                    "element is %d\n", second);
    }
    
    //simple method
    public static void findSecondHighest(int[] arr) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        System.out.println("second highest : " + secondHighest);
    }
}
