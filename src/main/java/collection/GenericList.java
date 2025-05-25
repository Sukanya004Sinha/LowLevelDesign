package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {

       private List<T> arr = new ArrayList<>();
        public void addElement(T element) {
            arr.add(element);
        }
        public void printElement(){
            for(T element : arr){
                System.out.println(element);
            }
        }
        public static void main (String[] args){
            GenericList<String> list1 = new GenericList<>();
            list1.addElement("Hello");
            list1.addElement("World");
            list1.printElement();

            GenericList<Integer> list2 = new GenericList<>();
            list2.addElement(1);
            list2.addElement(2);
            list2.addElement(3);
            list2.printElement();
        }

    }
