package Technical;

public class Reverse2DArray {
    
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        print2DArray(arr);

        // reverse2DArray(arr);

        reverse2DArrayLastElement(arr);
    }
    
    public static void reverse2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - j - 1];
                arr[i][arr[i].length - j - 1] = temp;
            }
        }
        System.out.println("After reversing");
        print2DArray(arr);
    }
    
    public static void reverse2DArrayLastElement(int[][] arr) {
          // Reverse the order of the rows
        for (int i = 0; i < arr.length / 2; i++) {
            int[] temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Reverse the elements in each row
        for (int[] row : arr) {
            for (int i = 0; i < row.length / 2; i++) {
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
        }

         print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for(int i =0 ; i<arr.length; i++) {
            for(int j =0 ; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
