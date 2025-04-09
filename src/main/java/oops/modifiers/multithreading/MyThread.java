package oops.modifiers.multithreading;

public class MyThread extends Thread {
    int[] values = {6, 5, 1, 7, 8};

    public void run() {
        // Loop through the array and double each element
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
        }


    }

    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();


    }
}
