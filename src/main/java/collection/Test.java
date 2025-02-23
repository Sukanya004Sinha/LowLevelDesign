package collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        int[] arr1 = {'a','b', 'c'};
        for (int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
