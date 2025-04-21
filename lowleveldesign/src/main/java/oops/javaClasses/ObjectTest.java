package oops.javaClasses;



/***
 * Super class and Sub Class
 * A class that is derived from another class is called Sub class
 * And from class through which subclass is derived it's called superclass
 * Object is top most class in java
 * in the absence of any other explicit superclass every class is implicitly a subclass of Object class
 * It has some common methods like clone(), toString(), equals(), notify(), wait(), notifyAll(), finalize()etc
 *
 */

public class ObjectTest {
    public static void main(String[] args){
        ObjectTest obj = new ObjectTest();
        Object obj1 = new Person(1);
        Object obj2 = new Person(10, "Kartik", "Bangalore");
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass().getName());
        System.out.println(obj2);
        System.out.println(obj1);
    }
}
