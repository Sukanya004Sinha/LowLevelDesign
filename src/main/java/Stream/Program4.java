package Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) {

        String s = "I am learning Java Api in Java Java";
        Map<String, Long> ans2 =Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ans2);

    }
}
