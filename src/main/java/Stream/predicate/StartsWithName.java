package Stream.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartsWithName {
    public static void main(String[] args) {
      List<String> names = List.of("Jacky", "James", "Janey",  "Monty");
      Predicate <String> startsWithJ=  name-> name.startsWith("J");
      Predicate<String> endsWithJ = name->name.endsWith("y");
      Predicate<String> combined = startsWithJ.and(endsWithJ);
      List<String> filtered = names.stream().filter(combined).collect(Collectors.toList());
      System.out.println(filtered);



    }



}
