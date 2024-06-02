package Technical;

import java.util.Arrays;

public class MaximizeEdgeSum {
    public static int getMaxEdgeSum(int N, int[] A, int[] B) {
        int[] vertexValues = new int[N];
        Arrays.fill(vertexValues, 1); // Initialize all vertices with value 1

        // Update vertex values based on edges
        for (int i = 0; i < A.length; i++) {
            int vertexA = A[i] - 1; // Adjust for 0-based indexing
            int vertexB = B[i] - 1;

            // Assign larger value to the vertex connected by the edge
            vertexValues[vertexA] = Math.max(vertexValues[vertexA], vertexValues[vertexB] + 1);
            vertexValues[vertexB] = Math.max(vertexValues[vertexB], vertexValues[vertexA] + 1);
        }

        // Calculate the sum over all edges' endpoints
        int maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            int vertexA = A[i] - 1;
            int vertexB = B[i] - 1;
            maxSum += vertexValues[vertexA] + vertexValues[vertexB];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = { 2, 2, 1, 2 };
        int[] B = { 1, 3, 4, 4 };

        int maxSum = getMaxEdgeSum(N, A, B);
        System.out.println("Maximized Edge Sum: " + maxSum);
    }
}
