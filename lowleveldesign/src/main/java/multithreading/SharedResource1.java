package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource1 {
    private Queue<Integer> sharedBuffer;
    private  int bufferSize;
    public SharedResource1(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    public synchronized  void produce(int item) throws Exception{
        // if buffer is full, wait for the consumer to consume the items
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: " +item);
        //Notify the consumer that there are items to consume now
        notify();

    }
    public synchronized int consume() throws Exception{
        //Buffer is empty wait for producer to produce items

        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed : " + item);
        //Notify the producer that there is space in the buffer now
        notify();
        return item;
    }
}
