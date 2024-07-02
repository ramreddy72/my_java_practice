package Technical;

public class TekSys {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        });
        t1.start();
    }
}
