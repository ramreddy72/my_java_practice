package Threads;

public class MyThread implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();
    }
}
