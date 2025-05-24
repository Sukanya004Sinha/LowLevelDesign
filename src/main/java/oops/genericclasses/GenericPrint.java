package oops.genericclasses;

public class GenericPrint<T>{
        T value;
        public T getPrintValue(){
            return value;
        }
        public void setPrintValue(T value){
            this.value = value;
        }

}
