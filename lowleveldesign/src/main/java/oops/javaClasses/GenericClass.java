package oops.javaClasses;
//generic class helps you to write a class in generic manner that helps you to avoid typecasting which you will face because of thsi Object class
public class GenericClass<T>{
    //Generic class
    T value;
    //Generic method
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }

}