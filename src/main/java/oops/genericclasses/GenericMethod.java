package oops.genericclasses;
//Type Parameter should be before the return type of the method declaration
//Type Parameter scope is limited to method only.


import java.util.Objects;

public class GenericMethod {

    public <K, V> void printValue(PairMethodclass<K, V> pair1, PairMethodclass<K, V> pair2) {
        if (pair1 == null || pair2 == null) {
            System.out.println("One or both pairs are null");
            return;
        }

        if (Objects.equals(pair1.getKey(), pair2.getKey())) {
            System.out.println("Both keys are same");
        } else {
            System.out.println("Keys are different");
        }
    }




}

