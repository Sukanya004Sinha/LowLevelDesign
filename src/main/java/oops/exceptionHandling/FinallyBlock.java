package oops.exceptionHandling;

public class FinallyBlock {
    public static void main(String[] args){
        try{
            method1("dummy");
            return;
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
    public static void method1(String name){
    }

}
