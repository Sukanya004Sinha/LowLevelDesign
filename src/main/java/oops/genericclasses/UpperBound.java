package oops.genericclasses;
// it can be used at generic class and Method
// - UpperBound ( <T extends Number>) means T can be of type Number or its subclass only.Here superclass ( in this example Number) we can have interface too.
// Multiple bounds ( <T extends Number & Comparable<T>>) means T can be of type Number or its subclass and it should implement Comparable interface.
public class UpperBound <T extends Number> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
    public static void main(String[] args){
        UpperBound<Integer> paramitrizedTypePrintObject = new UpperBound<Integer>();
    }


}
