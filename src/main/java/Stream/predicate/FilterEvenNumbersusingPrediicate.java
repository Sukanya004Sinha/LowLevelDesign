package Stream.predicate;

import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbersusingPrediicate {
    public static void main(String[] args){
    List<Integer> numbers = List.of(1,2,3,4,5,6,7);
    Predicate<Integer> isEven = num -> num%2==0;
    numbers.stream().filter(isEven).forEach(x->System.out.println(x));
    }

}
