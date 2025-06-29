package Stream.Function;

import java.util.function.Function;

public class Square {
    public static void main(String[] args){
        Function<Integer, Integer> square = num -> num *num;
        System.out.println(square.apply(5));
    }
}
