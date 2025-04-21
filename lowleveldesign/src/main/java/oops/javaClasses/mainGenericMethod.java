package oops.javaClasses;

public class mainGenericMethod {
    public static <T> void printValue(T value) {
        System.out.println("The value is: " + value);
    }

    public static void main(String[] args) {
        printValue(10); // Integer
        printValue("Hello"); // String
        printValue(3.14); // Double
        printValue(true); // Boolean
    }
}
