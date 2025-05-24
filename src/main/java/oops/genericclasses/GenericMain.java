package oops.genericclasses;

public class GenericMain {
    public static void main(String[] args) {
        GenericPrint<Integer> printObj = new GenericPrint<>();
        printObj.setPrintValue(1);
        Integer printValue = printObj.getPrintValue();
        if (printValue == 1) {
            System.out.println("Print value is 1");
        } else {
            System.out.println("Print value is not 1");
        }
    }
}
