package collection;

import java.util.Arrays;

public class Comparator<S> {
    public static void main(String[] args){
        Integer a[] = {6, 4, 1, 9 , 2 , 11};
        Arrays.sort(a, (Integer val1, Integer val2) -> val1-val2);
        for(int v: a){
            System.out.println(v);
        }
        Arrays.sort(a, (Integer value1, Integer value2) -> value2 - value1);
        for(int v: a){
            System.out.println(v);
        }

    }
}
