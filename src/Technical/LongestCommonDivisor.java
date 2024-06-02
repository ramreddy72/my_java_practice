package Technical;

public class LongestCommonDivisor {
      // Method to find the greatest common divisor (GCD) of two numbers using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to find the greatest common divisor (GCD) of an array of integers
    public static int gcdArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) { // Optimization: If GCD becomes 1, LCD will also be 1
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 18, 24 };
        int lcd = gcdArray(nums);
        System.out.println("Longest Common Divisor (LCD): " + lcd);
    }
}
