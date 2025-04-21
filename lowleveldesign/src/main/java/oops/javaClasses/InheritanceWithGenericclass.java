package oops.javaClasses;

public class InheritanceWithGenericclass<T>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }

}
