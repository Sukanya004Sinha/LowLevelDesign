package multithreading;

import java.util.concurrent.Callable;

public class CallableTask implements Callable{
    @Override
    public Object call() throws  Exception {
        return  "Test";
    }
    public static void main(String[] args){
        CallableTask task = new CallableTask();
        try{
            String result = (String) task.call();
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
