package oops.javaClasses;

public class ObjectInheritanceTest {
    public static void main(String[] args) {
        InheritanceNestedClass outer = new InheritanceNestedClass();
        InheritanceNestedClass.InnerClass2 innerClass2Obj = outer.new InnerClass2();
        innerClass2Obj.display();
    }
    }

