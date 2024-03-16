package Technical;

public class PrintFibonacciRecursive {
    public static void main(String[] args) {
        int seqLength = 10;

        for (int i = 0; i < seqLength; i++) {

            System.out.println(fibonaci(i) + " ");
        }
    }
    
    public static int fibonaci(int count) {
        if (count <= 1) {
            return count;
        }
        return fibonaci(count - 1) + fibonaci(count - 2);
    }


    public static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
	}
}
