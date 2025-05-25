package collection;

import java.util.*;

public class TestMap {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        Map<String, Integer>maps = new HashMap<>();
        maps.put("Jimmy", 1);
        maps.put("John", 2);
        maps.put("Jack", 3);
        maps.put("Jill", 4);
        maps.put("Jill", 5); // This will overwrite the previous value for "Jill
        System.out.println("Size of the map: " + maps.size());
        System.out.println(maps);
       System.out.println("Value for key 'Jimmy': " + maps.get("Jimmy"));
        for(Map.Entry<String, Integer> entry : maps.entrySet()){
            System.out.println(entry.getKey() + ": " +entry.getValue());
            System.out.println(entry.getValue());
        }
        //.out.println(maps.get("key: Rohit") >10);
        Optional<Integer> marksOfRohit = Optional.ofNullable(maps.get("Rohit"));
        if(marksOfRohit.isPresent()){
            System.out.println("Marks of Rohit:" +marksOfRohit.get());
        }
        else{
            System.out.println("Rohit is not present in the map.");
        }

    }
}
