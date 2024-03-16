package Technical;

public class PrintNnumbersWithoutLoops {

    static int i = 0;
    public static void main(String[] args) {
        int num = 10;
        printNumber(num);
    }

    public static void printNumber(int loop) {
        if (loop > 0) {
            printNumber(loop - 1);
            System.out.print(loop + " ");
        }
        return;
    }
}
