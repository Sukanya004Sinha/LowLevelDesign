package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[]args){
      //  List<String> names= Arrays.asList("Sukanya","John", "Kinna");
        List<String> names = new ArrayList<>(Arrays.asList("Sukanya", "Titu")); //to make it a resizable list:
        names.add("karan");
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
