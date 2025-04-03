package oops.multithreading;
class Hi extends Thread{
//    public void show(){
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
        }
    }

class Hello extends Thread {
//    public void show() {
public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
            Thread.sleep(5000);

        } catch(InterruptedException e){
        }
        }
    }
}
     public class ThreadDemo {
        public static void main(String[] args){
        Hi obj = new Hi();
        Hello obj2 = new Hello();
        obj.start();
            try {
                Thread.sleep(1000);}

             catch(InterruptedException e){
            }
        obj2.start();
//        obj.show();
//        obj2.show();

        }
    }

