package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {
       String s= "I am learning Streams Api in Java";
        String ans = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(2).findFirst().get();
        System.out.println(ans);
        String smallest =Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)).skip(0).findFirst().get();
        System.out.println(smallest);
        int ans1 = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(ans1);
        int smallestLength= Arrays.stream(s.split("")).map(x->x.length()).sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println(smallestLength);

    }
}
