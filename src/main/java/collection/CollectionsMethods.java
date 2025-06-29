package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        System.out.println("max value: " + Collections.max(values));
        System.out.println("Min value: " + Collections.min(values));
        Collections.sort(values);
        values.forEach((Integer val) -> System.out.println(val));

    }
}
