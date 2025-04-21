package oops.javaClasses;

/**
 * These are those classes which are defined in any block like for loop , while loop block if condition block method etc
 * It cannot be declared as private protected public only default (not defined explicit modifier) is used.
 * It cannot be initiated outside of this block.
 * It can access all the instance variable and method of the outer class.
 *
 */
public class LocalNonStaticInnerClass {
    // LocalNonStaticInnerClass class is a a outer class
    int instanceVariable = 10;
    static int classVariable = 20;


    public void display() {
        int methodLocalVariable = 30;
        class LocalInnerClass {
            int LocalInnerClassVariable = 50;

            public void print() {
                System.out.println(instanceVariable + classVariable + methodLocalVariable);
            }
        }

        LocalInnerClass localObj = new LocalInnerClass();
        localObj.print();
    }


}
