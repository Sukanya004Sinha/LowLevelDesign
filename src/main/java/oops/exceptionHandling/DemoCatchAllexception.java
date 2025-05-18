package oops.exceptionHandling;

public class DemoCatchAllexception {
    public static void main(String[] args){
        try {
            method1("dummy");
        }
        catch(Exception exception){
            //Note -- As Exception class is the Parent of ClassNotFound Exception so whevener you are using parent exception handle it properly firstly put a very specific and at last put a very generic


        }
        catch (ClassNotFoundException exception){

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