package oops.exceptionHandling;

public class ClassNotFoundTrycatch2 {
    public static void main(String[] args){
        try{
            method1();
        }
        catch(ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
