package Technical;

import java.util.Arrays;

public class Reverse2DArryout {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] myArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Rotate the 2D array 90 degrees counterclockwise
        rotate2DArray(myArray);

        // Print the result
        for (int[] row : myArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotate2DArray(int[][] arr) {
        int n = arr.length;

        // Transpose the array (rows become columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
    }
}
