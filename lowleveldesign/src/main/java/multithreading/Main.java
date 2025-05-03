package multithreading;

public class Main {
    public static void main(String[] args){
        System.out.println("Going inside main method "+ Thread.currentThread().getName());
        MultithreadingLearning runnableObj = new MultithreadingLearning();
        Thread t = new Thread();
        t.start();
        System.out.println("Finish main method " + Thread.currentThread().getName());
    }
}
