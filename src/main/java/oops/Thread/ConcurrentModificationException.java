package oops.Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Thread t1 = new Thread(() -> {
        for(String s:list) {
            System.out.println("T1:" + s);
            try {
                Thread.sleep(100);

            } catch (Exception e) {

            }
        }
        });
        Thread t2 = new Thread(()->{
            try{
                Thread.sleep(50);}
            catch(Exception e){}



                list.add("D");

        });
        t1.start();
        t2.start();
    }
}

