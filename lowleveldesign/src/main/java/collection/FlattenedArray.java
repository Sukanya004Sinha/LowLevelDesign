package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenedArray {
    public static List<Integer> flatten (List<Object> list){
        List<Integer> integerList = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            if(list.get(i) instanceof Integer) {
                integerList.add((Integer)
                        list.get(i));
            }
            else if (list.get(i) instanceof List<?>)
            {
                integerList.addAll(flatten((List<Object>) list.get(i)));



            }
        }
        return integerList;

    }
    public static void main(String[] args) {
        List<Object> array = Arrays.asList(1,2, Arrays.asList(2,6,7,8), Arrays.asList(3,4,5), 9);
        List<Integer> data = FlattenedArray.flatten(array);
        for(Integer i : data) {
            System.out.println(i);
        }

    }
}
