package oops.javaClasses;

public class MainnongenEx {
    public static void main(String[] args) {
        NongenericTypeExample<String, Integer> pairObj = new NongenericTypeExample<>();
        pairObj.put("Hello", 42);
    }
}
