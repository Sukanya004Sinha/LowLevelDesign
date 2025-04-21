package oops.javaClasses;

/**
 * It have access to all the instance variable and method of outer class.
 * Its object can be initiated  on after initiating the object of Outer class.
 * 1. Member Inner class
 * - it can be private, public, protected or package-private (default, no explicit declaration)
 *
 */

public class NonStaticNestedClass {
    int instanceVariable = 10;
    static int classVariable = 20;
    class InnerClass{
        public void printf(){
            System.out.println(instanceVariable + classVariable);
        }
    }
}
