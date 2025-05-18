package oops.exceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args){
        try{
            method1("dummy");
        }
        catch(ClassNotFoundException exception) {
        }
        catch(InterruptedException exception){

        }
        catch (FileNotFoundException exception){
            //handle teh exception
        }
    }
    public static void method1(String name) throws FileNotFoundException, InterruptedException, ClassNotFoundException{
        if(name.equals("dummy")){
            throw new FileNotFoundException();
        }
        else if(name.equals("Interrrupted")){
            throw new InterruptedException();
        }
    }

}
