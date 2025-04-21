package oops.javaClasses;

/** A class within another class is called Nested Class
 * If you know that a class (A) will be used by only one another class (B) instead of created new file (A.java) for it, we can create nested class inside B class itself.
 * And also help us to group logically related classes in one file.
 *Scope:
 * Its Scope is same as of its Outer class
 * it is of 2 types
 * Static Nested Class
 * Non Static Nested Class
 * Member Inner class
 * Local Inner class
 * Anonymous Inner class
 *
 *
 * Static Nested Class:
 * It do not have access to the non-static instance variable and method of outer class.
 * Its object can be initiated without initiating the object of the outer class
 * It can be private , public , protected or pqckage-private(default, np explicit decleration)
 *
 *
 */
public  class OuterClass {
     int instanceVariable = 10;
    static int classVariable= 20;





    private static class NestedClass{
        private int instanceVariable;

        public void print(){
            System.out.println(classVariable+ instanceVariable);

        }

    }
public static void display(){

NestedClass nestedClass = new NestedClass();
nestedClass.print();
System.out.println("Outer class static method");
}



}