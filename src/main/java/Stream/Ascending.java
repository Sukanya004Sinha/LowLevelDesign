package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    public static <list> void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(2);
        list.add(5);
        list.add(50);
        list.add(3);
        list.add(14);
        list.add(1);
        list.add(4);

        System.out.println("Before Sorting: " + list);
        //List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        List<Integer> sortedList = list.stream()
                .sorted((a, b) -> Integer.compare(a, b))
                .collect(Collectors.toList());



        System.out.println("Sorted List: " + sortedList);
    }
}
