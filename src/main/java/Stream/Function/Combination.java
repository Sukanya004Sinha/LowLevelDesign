package Stream.Function;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Combination {
            public static  void main(String[] args){
                List<Integer> numbers = Arrays.asList(1,2,3,4,5);
                Optional<Integer> result = numbers.stream().map(n-> n*n)
                        .filter(n-> n%2 ==0)
                        .reduce(Integer:: sum);
                // Output result
                result.ifPresent(System.out::println);  // Output: 20
            }
}