package oops.javaClasses;

public class SomeOtherClasses extends NonStaticInnerClass.InnerClass {
  SomeOtherClasses() {
    new NonStaticInnerClass().super();
    ///As you know when child clas constructor is invoked  it first invoked the constructor of parent class
    // so here it will invoke the constructor of NonStaticInnerClass
    }
    public void display() {
        System.out.println("Some Other Classes");
        display();
    }
}
