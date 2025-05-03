package multithreading;

public class MainClass {
    public static void main(String[] args){

           System.out.println("Going thread inside main method" +Thread.currentThread().getName());
           MultithreadingLearn myThread = new MultithreadingLearn();
           myThread.start();
           System.out.println("Finish main method:" +Thread.currentThread().getName());
    }
}
