package oops.modifiers.multithreading;

class Hii implements Runnable{
    public void run(){
        for (int i=0;i<=5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(5000); } catch (InterruptedException e){
            }
        }
    }
}
class Hellos implements Runnable{
    public void run(){
        for (int i=0;i<=5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(5000); } catch (InterruptedException e){
            }
        }
    }
}

public class ThreadSample {
    public static void main(String[] args){
        Hii obj = new Hii();
        Hellos obj2 =new Hellos();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
