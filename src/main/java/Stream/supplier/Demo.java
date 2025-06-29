package Stream.supplier;

import java.util.function.Supplier;

public class Demo {
    //Supplier - which does not take any input but returns an output
    public static void main(String[] args){
        Supplier<Double> randomNymberSupplier =() -> Math.random();
        double ramdomNumber = randomNymberSupplier.get();
        System.out.println("Random Number: " + ramdomNumber);
    }
}
