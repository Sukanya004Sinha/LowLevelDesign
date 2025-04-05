package oops.multithreading;

/***
 * 1 is least priority
 * 10 is highest priority
 * and 5 is the normal priority
 */
public class ThreadPriority {
    public static void main(String[] args) throws Exception {
        // First thread (t1)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi" + Thread.currentThread().getPriority() + " "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(500);  // Sleep for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        // Second thread (t2)
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);  // Sleep for 50 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Set thread names
        t1.setName("Hi Thread 1");
        t2.setName("Hello Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority (1)
        t2.setPriority(Thread.MAX_PRIORITY);

        // Print thread names
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // Start threads
        t1.start();
        try {
            // Sleep for 1 second before starting the second thread
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        // Wait for threads to finish
        t1.join();
        t2.join();
    }



    }

