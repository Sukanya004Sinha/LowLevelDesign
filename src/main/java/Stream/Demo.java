package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args){
        // Create the stream of strings
        Stream<String> streamString = Stream.of("Sukanya", "Ram", "Shyam", "kartik", "Sam");
        Stream<String> filteredStream= streamString.filter((String name)-> name.length()<=3);
        List<String> filteredNameList = filteredStream.collect(Collectors.toList());

//        // Apply the filter to get names of length <= 3
//        List<String> filteredList = streamString
//                .filter(name -> name.length() <= 3)
//                .collect(Collectors.toList());  // Collect the result into a list

        // Print the filtered names
        filteredNameList.forEach(System.out::println);
        // Map (Function<T, R> mapper)
        Stream<String> nameStream = Stream.of("Sukanya", "Ram", "Shyam", "Kartik", "Sam");
        Stream<String> mappedStream = nameStream.map( name-> name.toLowerCase());
        //List<String> mappedList = mappedStream.collect(Collectors.toList());
        // Print the mapped names
        mappedStream.forEach(System.out::println);
    }
}
