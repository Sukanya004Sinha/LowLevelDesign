package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MainCallableMethods {
   // public static void main(String[] args) throws ExecutionException, InterruptedException{
    public  static  void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> callable1 = () -> {
            System.out.println("Task 1");
            return  1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
        List<Future<Integer>> futures = null; // invokeAll() is a method of executor service that allows you to submit multiple task at once and wait for all of them to complete
        try {
            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }
        for(Future<Integer> f: futures){
            try {
                System.out.println(f.get());

            } catch (CancellationException e){}
            catch (ExecutionException e) {


            } catch (InterruptedException e) {

            }
        }

         executorService.shutdown();
       //  System.out.println(executorService.isShutdown());
         System.out.println("Hello World");



    }}
