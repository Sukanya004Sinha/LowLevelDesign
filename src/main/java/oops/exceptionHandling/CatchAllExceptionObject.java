package oops.exceptionHandling;

public class CatchAllExceptionObject {
    public static void main(String[] args){
        try{
            method1("dummy");
        }
        catch(ClassNotFoundException exception) {

        }
        catch(Exception exception){

        }
    }
    public static void method1(String name) throws ClassNotFoundException, InterruptedException{
        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        }
        else if(name.equals("Interrupted")){
            throw new InterruptedException();
        }
    }
}
