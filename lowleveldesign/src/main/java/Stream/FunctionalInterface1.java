package Stream;

/** Functional Interface is an interface which has only one method */
@FunctionalInterface
interface ABC {
    void show(int i, int j );
}

// Define the Abcd class or interface
interface Abcd{
    void print();
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
//
        ABC obj =  (i, j)  -> System.out.println("in show method" + i + " " + j);
        obj.show(8, 9);

        // Create an anonymous class for Abcd
        Abcd obj1 = ()-> {

                System.out.println("in print method");

        };
        obj1.print();
    }
}