package multithreading;

import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello";
        Future<String> future = executorService.submit(callable);
        //Future<String> future = executorService.submit(()-> "Hello");
        //Future<Integer> future = executorService.submit(()-> 42);
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("Task is done!!");

        }
        executorService.shutdown();
    }
}
