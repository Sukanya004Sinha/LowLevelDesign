package oops.multithreading;
class Q{
    int num;
    public void put (int num) {
        this.num = num;
    }
    public int get(){
        return num;
    }
}
class Producer implements Runnable {
    Q q;
    Producer (Q q){
        this.q = q;
    }
    public void run(){
        int i =0;
        while (true){
            q.put(i++);
        }
    }
}
public class InterThread {
    public static void main (String[] args){

    }
}
