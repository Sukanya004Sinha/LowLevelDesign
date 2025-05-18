package oops.exceptionHandling;

public class ClassNotFoundUsingTryCatch {
    public static void main(String[] args){
        method1();

    }
    public static void method1(){
        try{
            throw new ClassNotFoundException();

        }
        catch(ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
