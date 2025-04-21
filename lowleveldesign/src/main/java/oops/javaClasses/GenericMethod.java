package oops.javaClasses;

public class GenericMethod<K, V> {
    /**
     * What if we only wants to make Method Generic , not the complete class we can write generic methods too.
     * Type parameter should be  before return type of method declaration
     * Type parameter scope is limited to method only.
     */
    private K key;
    private V value;
    GenericMethod(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
