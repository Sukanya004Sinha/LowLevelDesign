package collection;

import java.util.PriorityQueue;

public class MinPriorityQueue {
public static void main(String[] args){
    //Min priority queue used to silve the problems of min heap
    PriorityQueue<Integer> minPq = new PriorityQueue<>();
    minPq.add(5);
    minPq.add(2);
    minPq.add(8);
    minPq.add(1);
    //lets print all the values
    minPq.forEach((Integer val)-> System.out.println(val));
    // remove the element from the minPq and print
    while(!minPq.isEmpty()){
        int val = minPq.poll();
        System.out.println("remove from top: " + val);

    }

}
}

