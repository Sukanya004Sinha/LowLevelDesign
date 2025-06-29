package Stream.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StartesWithamesUsingRemoveIf {
    public static void main(String[] args){
        List<String> names = new ArrayList<> (List.of("Jeetu", "Jitendra", "Jay", "Sukanya"));
//        Predicate<String> namesStartsWithj = name -> name.startsWith("J");
//      names.removeIf(namesStartsWithj);
//        System.out.println(names);
        Predicate<String>  validLength= s->s !=null && !s.isEmpty() && s.length()>3;
        for (String name: names) {

            System.out.println(name + " is valid " + validLength.test(name)) ;


        }
    }


}
