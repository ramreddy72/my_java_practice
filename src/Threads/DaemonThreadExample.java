package Threads;

public class DaemonThreadExample {
   public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Set the thread as daemon
        daemonThread.start();

        // Main thread
        System.out.println("Main thread exiting...");
    }

    static class DaemonTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Daemon thread running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        
}
