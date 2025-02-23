package java8features.basic;

import java.util.function.Function;

public class Test {
    public static void main(String[] args){
        Function<Integer,Integer> f= i->i*i;
        System.out.println("The square of 40:"+f.apply(40));
        System.out.println("The Square of 50:"+f.apply(50));
    }
}
