package oops.javaClasses;


public class ObjectTestNonStatic {
    public static void main (String[] args){
        NonStaticNestedClass outers = new NonStaticNestedClass();
        NonStaticNestedClass.InnerClass inner = outers.new InnerClass();
    }
}
