package Stream.Function;

import java.util.function.Function;

public class UpperCase {
    public static void main(String[] args){
        Function<String, String> toupperCase = name-> name.toUpperCase();
        String result = toupperCase.apply("Sukanya");
        System.out.println(result);

    }
}
