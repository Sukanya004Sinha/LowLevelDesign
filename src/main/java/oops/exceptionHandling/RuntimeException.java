package oops.exceptionHandling;

public class RuntimeException
{
    public static void main(String[] args) throws ArithmeticException {
        method1();
    }
    public static void method1() throws ArithmeticException {
        throw  new ArithmeticException();
    }
}
