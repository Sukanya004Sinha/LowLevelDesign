package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateUsingStream {
    public static void main(String[] args){
        int[] numbers =  {10,20,10, 30, 30, 40 ,50};
        int[] uniqueNumbers = IntStream.of(numbers).distinct().toArray();
        int[] uniqueNum = Arrays.stream(numbers).distinct().toArray();
        System.out.println(Arrays.toString(uniqueNum));
        System.out.println(Arrays.toString(uniqueNumbers));
        List<Integer> uniqueList = Arrays.stream(numbers).boxed().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
