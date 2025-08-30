package collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
    static ConcurrentHashMap<Integer,String> hm = new ConcurrentHashMap <Integer,String>();
    public void run(){
    try{
        Thread.sleep(1000);
        hm.put(104, "Denny");

    }
    catch (InterruptedException e) {
        System.out.println("Child thread to add the element");

    }
    }
    public static void main(String[]args)throws InterruptedException{
        hm.put(100, "sag");
        hm.put(101,"sal");
        hm.put(102, "Ben");
        ConcurrentHashMapDemo  hm1 =new ConcurrentHashMapDemo();
        hm1.start();
        for (Object o: hm.entrySet()){
            Object s =o;
            System.out.println(s);
            Thread.sleep(100);
        }
        System.out.println(hm);

    }

    //Java 7 -> Segments based Locking--> Smaller HashMaps
    //Only the Segment being written or read from is locked
    //Read : do not require locking unless there is a write operation happening on the same segment
    //write : lock
    //java 8 -->no segmentation
    //--> Comapare and Swap approach --> no locking except resizing or collasion

}
