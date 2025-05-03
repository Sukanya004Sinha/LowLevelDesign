package multithreading;

public class MultithreadingLearn extends Thread{
    @Override
    public void run(){
        System.out.println("Code executed bt thread:" +Thread.currentThread().getName());

    }

}
