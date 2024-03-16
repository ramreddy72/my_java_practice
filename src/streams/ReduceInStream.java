package streams;


public class ReduceInStream {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumOfArray(array);
        System.out.println("Sum of array: " + sum);

       
    }

    public static int sumOfArray(int[] array) {
        return java.util.Arrays.stream(array).reduce(0, (a, b) -> a + b);
    }

}
