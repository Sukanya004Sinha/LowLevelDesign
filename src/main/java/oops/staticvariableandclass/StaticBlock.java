package oops.staticvariableandclass;

/**
 * In java static block and instance blocks  are used to initialize the values before the execution of constructors.
 * Static Block runs once when the class loaded into memory
 * Used to initialize the static variables
 */
public class StaticBlock {
    static int staticVar;

    static{
        System.out.println("Static block");
        staticVar = 10;
        System.out.println("staticVariable: "+staticVar);
        new StaticBlock();

    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
      System.out.println("staticVar: "+staticVar);
    }

}

