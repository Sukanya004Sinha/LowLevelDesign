package oops.methodoverriding;
class A {

    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("A in config");
    }

}
class B extends A {
   public void show(){
        System.out.println("In B show");


   }
        }

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        A obj1 = new A();
        obj.show();
        obj1.show();
        obj.config();
    }
}


