package oops.javaClasses;

public class WithoutGenericMain {
    public static void main(String [] args){
        WithoutGenericClass printObj1 = new WithoutGenericClass();
        printObj1.setPrintValue(1);
        Object printValue = printObj1.getPrintValue();
        //we cant use printValue directly , we need to cast it else it will give compile time error
        if((int)printValue ==1){
            System.out.println("Value is 1");
        }

    }

}
