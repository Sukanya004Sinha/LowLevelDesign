package multithreading;

/**
 * Monitor lock -> It helps to make sure that only 1 thread goes inside the particular section of code (a synchronized block or method)
 */

public class MonitorLockExample {
    public synchronized void task1() {
        //do something
        try {
            System.out.println("Inside task1 ");
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public void task2() {
        System.out.println("inside task2 before synchronized");
        synchronized (this) {
            System.out.println("task2 inside synchronized");
        }
    }

    public void task3() {
        System.out.println("task3");

    }

    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> {
            obj.task1();
        });
        Thread t2 = new Thread(() -> {
            obj.task2();
        });
        Thread t3 = new Thread(() -> {
            obj.task3();
        });
        t1.start();
        t2.start();
        t3.start();


    }
}

