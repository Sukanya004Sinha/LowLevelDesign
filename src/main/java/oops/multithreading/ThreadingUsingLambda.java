package oops.multithreading;

/**
 * Join method is used to make te main tread wait for the child thread to finish
 * isAlive method is used to check if thread is alive or not
 */
public class ThreadingUsingLambda {
    public static void main(String[] args) throws Exception{
        Runnable obj = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            };

            Runnable obj2 = () -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                    }
                }
                };



            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj2);
            t1.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t1.isAlive());
            t2.start();
            t1.join();
            t2.join();
        System.out.println(t1.isAlive());
            System.out.println("Bye");
        }
    }