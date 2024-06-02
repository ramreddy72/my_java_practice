package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
       // Create a fixed-size thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            // Submit a task to the executor
            executor.submit(new Task(i));
        }

        // Shutdown the executor to gracefully terminate
        executor.shutdown();
    }
}

class Task implements Runnable {

    private int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Task "+ taskId + " completed");
    }
}
