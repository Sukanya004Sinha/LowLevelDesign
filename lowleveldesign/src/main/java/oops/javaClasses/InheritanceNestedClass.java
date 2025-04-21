package oops.javaClasses;

/**
 * Example 1 : One inner class inherit another inner class in same outer class
 *
 */
public class InheritanceNestedClass {
   // InheritanceNestedClass is outer class
    int instanceVariable = 10;
    static int classVariable = 2;
    class InnerClass {
        int innerClass1 = 3;
    }
    class InnerClass2 extends InnerClass{
        int innerClass2 = 4;
        void display(){
            System.out.println(innerClass1+ innerClass2 + instanceVariable + classVariable);

        }

    }

}
