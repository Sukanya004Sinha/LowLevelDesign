package oops.thisandsuper;
/** for every constructor the first statement is super means call the constructor of super class
 every class in java is extending the object class
so when you are saying constructor so basically its calling the constructor of object class **/


/** This will executes the constructor oof the same class  super method executes the constructor of super class**/
class A{
public A(){
    super();
    System.out.println("in A");
}
public A (int n){
    super();
    System.out.println("in A int");
}
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
 public B(int n){
        this();
        System.out.println("in B int");
 }
}

public class Demo {
    public static void main(String[] args){
        B obj = new B(8);

    }
}
