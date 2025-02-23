package java8features.lambdaExpression;

public class Test {
    /***
     * Lambda Expression -> It is an anonymous function(without name , without return type, without modifier)
     * The main objective of Lambda Expression :
     * to bring of functional programming into java
     */
    /***
     * normal method
     * public void m1() {
     *     System.out.println("Hello");
     * }
     ****************************************
     * Writing Lambda Expression for this method
     * () -> System.out.println("Hello");
     * if multiple lines are there then we need to add curly braces{}
     */

 /**   public void m1(int a, int b){
        System.out.println(a+b);
    }
    (a,b) -> System.out.println(a+b);
}
  */
/****
 * public int squareIt(int n) {
 *     return n*n;
 * }
 * n-> n*n; //valid
 * n-> {return n*n;}; // valid
 * n-> {return n*n}; // invalid
 */

/**
 * public void m1(String s){
 *     return s.length();
 * }
 * (String s)-> {return s.length();}
 * or s-> s.length();
 */
}

/********Notes**********/
/**
 * 1.Without curly braces we cannot use return keyword.Compiler will consider  returned value automatically
 *2. Within curly braces if we want to return  some value compulsory we should use return statement
 */


