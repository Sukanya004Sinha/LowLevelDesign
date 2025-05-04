package multithreading;

public class MainSharedresource3 {
    public static void main(String[] args) {
        SharedResource3 resource = new SharedResource3();
        System.out.println("Main Thread started");
        Thread th1 = new Thread (()->{
            System.out.println("Thread1 calling the produce method");
            resource.produce();
        });
        Thread th2 = new Thread(()->{
            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
            System.out.println("Thread calling produce method");
            resource.produce();
        });
        th1.start();
        th2.start();
        try{
            Thread.sleep(30000);
        } catch (Exception e){

        }
        System.out.println("Thread 1 is suspended");
        th1.suspend();
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){}
        th1.resume();
        System.out.println("Main thread is finishing its work");
    }

}
