package oops.classandobjects;

/***
 * Objets - Properties and Behaviour
 */
class Calculator {
    public int add(int num1 , int num2) {

        int r = num1 +num2 ;
        System.out.println("in add");
        return  r;
    }
    public int subtract(int num1, int num2){
        int r = num1-num2;
        System.out.println("in subtraction");
        return  r;
}
public  int mutiply (int num1 , int num2){
        int r = num1* num2;
        System.out.println("In multiply");
        return  r;
}

}
public class Test {
    public static void main (String[] args) {
       int num1= 10;
       int num2= 5;
//         int result = num1+num2 ;
//         System.out.println(result);
        Calculator calc = new Calculator();
         int result =  calc.add(num1, num2);
         int result1 = calc.subtract(num1,num2);
         int result2 = calc.mutiply(num1,num2);
         System.out.println(result);
         System.out.println(result1);
         System.out.println(result2);
    }
}
