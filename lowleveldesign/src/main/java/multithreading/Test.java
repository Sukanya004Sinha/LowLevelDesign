package multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(9);
        Executors.newSingleThreadExecutor();
        // Thread[] threads = new Thread[9];
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            //   threads[i - 1] = new Thread(

            executorService.submit(() -> {
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
            // threads[i - 1].start();
        }
//        for(Thread thread: threads){
//            try{
//                thread.join();
//            }
//            catch (InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Total time" + (System.currentTimeMillis() - startTime));
        // }
    }

        private static long factorial ( int n){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }
