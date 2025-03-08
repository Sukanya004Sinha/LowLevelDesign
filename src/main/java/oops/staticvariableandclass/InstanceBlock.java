package oops.staticvariableandclass;

/**
 * Instance Initializer Block
 * Runs before the constructor when an object is created
 * Used to initialize the instance variables
 */
public class InstanceBlock {
    int instanceVar;
    {
        System.out.println("Instance block executed");
        instanceVar = 20;
        System.out.println("instanceVar:"+ instanceVar);
    }
    InstanceBlock(){
        System.out.println("Constructor executed");
    }
    public static void main(String[] args){
        System.out.println("main method executed");
        System.out.println("Creating first object");

        InstanceBlock instanceBlock = new InstanceBlock();
        System.out.println("\nCreating Second object");
        InstanceBlock instanceBlock1 = new InstanceBlock();

    }
}
