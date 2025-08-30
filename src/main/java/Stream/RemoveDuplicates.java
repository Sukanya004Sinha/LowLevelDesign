package Stream;

import java.util.Arrays;

//String S= "dabcadefg"
//o/p-> dabcefg
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "dabcacdefg";
        s.chars().distinct().mapToObj(x-> (char)x).forEach(System.out::print);
        //Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
