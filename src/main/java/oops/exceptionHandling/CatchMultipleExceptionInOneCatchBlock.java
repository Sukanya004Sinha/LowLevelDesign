package oops.exceptionHandling;

public class CatchMultipleExceptionInOneCatchBlock {
    public static  void main(String [] args){
        try{
            method1("dummy");
        }
        catch(ClassNotFoundException | InterruptedException exception) {

        }
        catch(Exception exception){

        }
}
public static void method1(String name) throws ClassNotFoundException, InterruptedException{
        if(name.equals("dummy")){
            System.out.println("dummy");
            throw new ClassNotFoundException();
        } else if (name.equals("Interrupted")) {

            throw  new InterruptedException();
        }
}
}
