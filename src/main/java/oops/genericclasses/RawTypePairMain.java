package oops.genericclasses;

public class RawTypePairMain {
    public static void main(String[] args){
        RawTypePair<String> paramitrizedTypeObject = new RawTypePair<>();
        paramitrizedTypeObject.setPrintValue("hello");
        System.out.println("Paramitrized object value is: " + paramitrizedTypeObject.getPrintValue());
        //internally it passes an object as Paramitrized type
        RawTypePair rawTypePrintObj = new RawTypePair();
        rawTypePrintObj.setPrintValue(1);
        rawTypePrintObj.setPrintValue("hello");
        //rawTypePrintObj.setPrintValue(1.0); // This will not compile
        System.out.println("Raw type value (updated): " + rawTypePrintObj.getPrintValue());
    }
}
