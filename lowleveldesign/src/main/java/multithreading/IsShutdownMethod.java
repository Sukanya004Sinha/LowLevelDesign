package multithreading;

import java.nio.file.Files;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IsShutdownMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit  = executorService.submit(() -> 1 +2);
        Integer i = submit.get(); // submit.get() waits for the task to complete and retrieves the result.
        System.out.println("Sum is" +i);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        Thread.sleep(1000);
        System.out.println(executorService.isTerminated());
    }
}
