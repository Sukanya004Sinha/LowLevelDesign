package collection;
import java.util.*;
public class VectorMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //insert an element
        arr[0] = 1;
        //get front element
        int val = arr[0];
        Vector <Integer> vector = new Vector();
        //insert an element in vector
        vector.add(1);
        //get element
        vector.get(0);
        System.out.println("element from vector :" +vector.get(0)
                           + " and element from array :" + arr[0]);
    }
}
