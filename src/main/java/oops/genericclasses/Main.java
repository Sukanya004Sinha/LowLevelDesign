package oops.genericclasses;

public class Main {
    public static void main(String[] args){
        Print printObj = new Print();
        printObj.setPrintValue(1);
       Object printValue = printObj.getPrintValue();
        if((int) printValue==1){
            System.out.println("Print value is 1");
        } else {
            System.out.println("Print value is not 1");
        }
    }
}
