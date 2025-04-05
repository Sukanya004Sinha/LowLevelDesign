package oops.multithreading;

import org.springframework.scheduling.config.Task;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Performs possible asynchronous (non -blocking) computation and trigger dependant computations wic could be asynchronous.
 * In java to perform a non blocking operation has always been easy.. You simply create a new Runnable and you run it in a separate thread and one that runnable calls a run method and a run method is completed that thread is destroyed
 * if the task that you want to run also is returning a value back you could use Something called as callable... So you again create a new thread complete the thread and then you get the value back the variable that you want in the main thread and we typically do this using executor service
 */
//Working with CompletableFuture


public class CompletableFuture {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        // Submit task and accept the placeholder for the return value
        Future<Integer> future = service.submit(new Task());
        try {
            // GET the task return value
            Integer result = future.get(); // Blocking
            System.out.println("Result from the task is " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() {
            return new Random().nextInt();
        }
    }
}