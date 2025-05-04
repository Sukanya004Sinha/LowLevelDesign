package multithreading;

public class SharedResource3 {
    boolean isAvailable = false;
    public synchronized void produce() {
        System.out.println("Lock acquired");
        isAvailable = true;
        try {
            Thread.sleep(80000);

        } catch (Exception e) {
        }

    System.out.println("Lock release");


    }
}
