package Stream.Function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = List.of("java", "spring", "python");
        Function<String, String> result = s->s.substring(0,1).toUpperCase() +s.substring(1);
        List<String> capatalizednames = names.stream().map(result).collect(Collectors.toList());
        System.out.println(capatalizednames);
    }
}


