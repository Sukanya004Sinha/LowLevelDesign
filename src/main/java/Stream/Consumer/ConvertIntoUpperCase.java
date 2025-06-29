package Stream.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConvertIntoUpperCase {
    public static void main(String[] args){
        List<String> names =List.of("Jacky", "Jill", "John");
        Consumer<String> printName = name-> System.out.println(name.toUpperCase());
         names.forEach(printName);

    }
}
