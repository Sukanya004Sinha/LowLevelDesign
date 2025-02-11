package collection;

import ch.qos.logback.classic.pattern.MDCConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Sukanya", 10);
        marks.put("Ashfaq", 30);
        marks.put("Sparm", 60);
        marks.put("Spencer", 70);
        marks.put("Saket", 20);
        System.out.println(marks);
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("...........");

        }
       // System.out.println(marks.get("subham")>10);
        /**
         * Optional is used to remove null pointer exception
         */
        Optional<Integer> marksOfRohit = Optional. ofNullable(marks.get("rohit"));
        System.out.println(marksOfRohit);
                if(marksOfRohit.isPresent()){

                }
                else{
                    System.out.println("I am not present");
                }
    }
}
