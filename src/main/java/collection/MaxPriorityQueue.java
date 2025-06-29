package collection;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer a, Integer b)-> b-a);
        maxPq.add(5);
        maxPq.add(2);
        maxPq.add(8);
        maxPq.add(1);
        //lets print all the values
        maxPq.forEach((Integer val) -> System.out.println(val));
        // remove the element from the maxPq and print
        while(!maxPq.isEmpty()){
            int val = maxPq.poll();
            System.out.println("remove from top: "+ val);
        }
    }
}
