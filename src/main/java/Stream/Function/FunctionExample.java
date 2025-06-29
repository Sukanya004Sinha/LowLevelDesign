package Stream.Function;

import java.util.function.Function;

public class FunctionExample {
    // A function that returns an argument and produce an output
    public static void main(String[] args){
        Function<Integer, String>  intToStringConvertor =integer -> "Number" + integer;
        String result = intToStringConvertor.apply(43);
        System.out.println(result);
    }
}
