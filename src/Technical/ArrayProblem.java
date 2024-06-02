package Technical;

public class ArrayProblem {
    //input 3
    //output 
    // 1 2 3
    // 8 9 4
    // 7 6 5

    //input 4
    //output
    // 1 2 3 4
    // 12 13 14 5
    // 11 16 15 6
    // 10 9 8 7

    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];
        int count = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (count <= n * n) {
            for (int i = startCol; i <= endCol; i++) {
                arr[startRow][i] = count++;
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                arr[i][endCol] = count++;
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                arr[endRow][i] = count++;
            }
            for (int i = endRow - 1; i > startRow; i--) {
                arr[i][startCol] = count++;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
