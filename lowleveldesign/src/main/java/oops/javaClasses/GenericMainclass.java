package oops.javaClasses;

public class GenericMainclass {
    public static void main(String[] args){
        GenericClass<Integer> printObj1 = new GenericClass<>();
        printObj1 .setPrintValue(1);
        Integer printValue = printObj1.getPrintValue();
        if(printValue == 1){
            System.out.println("Value is 1");
        }

    }
}

