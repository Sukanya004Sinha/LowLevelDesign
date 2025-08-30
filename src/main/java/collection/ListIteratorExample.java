package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>(Arrays.asList("Sukanya", "Sinha", "Durgesh"));
        ListIterator<String> lit = names.listIterator();
        System.out.println("Forward:");
        while (lit.hasNext()){
            System.out.println(lit.next());

        }
        System.out.println("Backward:");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }


}
