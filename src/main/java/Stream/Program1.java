package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class Program1 {
    public static void main(String[] args){
        String s= "I am learning Streams API in Java";
        String ans =
                Arrays.stream(s.split(" ")).max(Comparator.comparing(s1->s1.length())).get();
        System.out.println(ans);
        String smallest = Arrays.stream(s.split(" ")).min(Comparator.comparing(String::length)).get();
        System.out.println(smallest);
    }
}
