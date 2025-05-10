package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NaneString {
    public static void main(String[] args) {
        Stream<String> namedString = Stream.of("Kartikey", "Sukanya", "Pratik", "Anupama", "ee", "Atish", "Anupam", "Amit", "Abhishek");
        Stream<String> filteredString = namedString.filter((String name) -> name.length() <= 6);
        List<String> filteredNameList = filteredString.collect(Collectors.toList());
        Stream<String> namedString1 = Stream.of("Kartikey", "Sukanya", "Pratik", "Anupama", "ee", "Atish", "Anupam", "Amit", "Abhishek");
        Stream<String> filteredStrings = namedString1.filter((String names) -> names.startsWith("A"));
        List<String> filterednameLsits = filteredStrings.collect(Collectors.toList());
        System.out.println(filteredNameList);
        System.out.println(filterednameLsits);

        List<String> namedString2 = Stream.of("Kartikey", "Sukanya", "Pratik", "Anupama", "ee", "Atish", "Anupam", "Amit", "Abhishek","ANUP")
                .filter(names -> names.equals(names.toUpperCase()))
             .collect(Collectors.toList());
        System.out.println(namedString2 );

        List<String> lowercaseOnly = Stream.of("Kartikey", "sukanya", "pratik", "anupama", "ee")
                .filter(name -> name.equals(name.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println(lowercaseOnly);

        List<String> fulllowercaseOnly = Stream.of("Kartikey", "sukanya", "Pratik", "Anupama", "Ee")
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(fulllowercaseOnly);

    }
}
