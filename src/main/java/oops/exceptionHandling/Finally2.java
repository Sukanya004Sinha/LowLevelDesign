package oops.exceptionHandling;


public class Finally2 {
    public static void main(String[] args) {
        try {
            method1("dummy");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException");
        } finally {
            System.out.println("This is the finally block");
        }
    }

    public static void method1(String name) throws ClassNotFoundException {
        if (name.equals("dummy")) {
            throw new ClassNotFoundException();
        }
    }
}

