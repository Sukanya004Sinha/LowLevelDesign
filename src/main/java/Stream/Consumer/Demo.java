package Stream.Consumer;

import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args){
        Consumer<String> printer = str-> System.out.println("Hello, " + str);
        printer.accept("Sukanya");
    }
}
