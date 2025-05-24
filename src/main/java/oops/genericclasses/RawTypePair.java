package oops.genericclasses;
// oit is a name of the generic class or interface without any type argument

public class RawTypePair<T> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}
