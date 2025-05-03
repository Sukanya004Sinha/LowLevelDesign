package multithreading;

/**
 * Two threads a producer and a consumer share a common fixed size queue the producer job is to generate data and put it into the buffer while a consumer's job is to consume the data from the buffer
 * the problem is to make sure that the producer won't produce the data if the buffer is full , and consumer wont consume the data if the queue id empty.
 */
public class ProducerConsumerMain {
    public static void main(String[] args){
        SharedResource1 sharedBuffer = new SharedResource1(3);
        //creating producer thread using lambda expression
        Thread producerThread = new Thread(()->{
            try {
                for (int i = 1; i <= 6; i++) {
                    sharedBuffer.produce(i);
                }
            }
                catch(Exception e){

                }

        });
        //creating consumer thread using lambda expression
        Thread consumerThread = new Thread(() -> {
            try {

                for (int i = 1; i <= 6; i++) {
                    sharedBuffer.consume();
                }
            }
                catch (Exception e){

            }

        });
        producerThread.start();
        consumerThread.start();
    }
}
