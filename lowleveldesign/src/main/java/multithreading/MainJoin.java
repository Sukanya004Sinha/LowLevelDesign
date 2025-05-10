package multithreading;

import ch.qos.logback.core.encoder.EchoEncoder;

public class MainJoin {

    public static void main(String[] args) {
        SharedResource3 resource = new SharedResource3();
        System.out.println("Main Thread started");
        Thread th1 = new Thread(() -> {
            System.out.println("Thread1 calling the produce method");
            resource.produce();
        });
        Thread th2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("Thread calling produce method");
            resource.produce();
        });
        th1.start();
        try {
            System.out.println("Main Thread is waiting thread 1 to finish now");
            th1.join();
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        th2.start();
        try {
            System.out.println("Main Thread is waiting thread 2 to finish now");

            th2.join();
            Thread.sleep(3000);
        } catch (Exception e){}
        System.out.println("Main thread is finishing  its work");

    }

}

