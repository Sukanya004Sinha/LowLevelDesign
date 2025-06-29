package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllCollectionMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        System.out.println("size: " +values.size());
        System.out.println("isEmpty: " +values.isEmpty());
        //contains
        System.out.println("contains:" + values.contains(20));
        values.add(5);
        System.out.println("values contains 5: "+ values.contains(5));
        //remove using index
        values.remove(3);
        System.out.println(("values after removing index 3: " + values));
        values.remove(Integer.valueOf(20));
        System.out.println("values after removing 20: " + values);
        System.out.println("removed using  object" + values.contains(20));
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println("Stack size: " + stack.size());
        stack.addAll(values);
        System.out.println("stack after addong values from list: " + stack);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        values.clear();


    }
}
