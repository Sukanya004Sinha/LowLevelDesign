package oops.genericclasses;

public class MainGenericMethod {
    public static void main(String[] args) {
        PairMethodclass<String, Integer> p1 = new PairMethodclass<>("key1", 100);
        PairMethodclass<String, Integer> p2 = new PairMethodclass<>("key2", 200);

        GenericMethod gm = new GenericMethod();
        gm.printValue(p1, p2);
    }
}