package java8features.functionalprogramming;
@FunctionalInterface
public interface Interf {
    public void m1();
}
/*********/
interface A{
    public void m1();//valid
}
@FunctionalInterface
interface B extends A  {
    public void m1(); //valid
    //public void m2(); // Invalid
    /* multiple non-overriding abstract methods found in interfaces**/
}
