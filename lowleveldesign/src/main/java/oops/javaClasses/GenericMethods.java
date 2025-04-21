package oops.javaClasses;

public class GenericMethods {
    public<K, V> void printValue(GenericMethod<K,V> pair1 , GenericMethod<K,V> pair2){
        if(pair2.getKey() instanceof String){
            System.out.println("Key is a String: " + pair2.getKey());
        } else {
            System.out.println("Key is not a String: " + pair2.getKey());
        }
        if(pair2.getKey().equals(pair2.getKey())){
            //do something
        }
    }
}
