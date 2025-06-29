package Stream;

import java.util.function.Predicate;

public class TestPredicateNegate {
    public static void main(String[] args){
        Predicate<String> startsWithJ = name->name.startsWith("J");
        Predicate<String> notStartWithJ = startsWithJ.negate();
        System.out.println(notStartWithJ.test("Sukanya"));
        System.out.println(notStartWithJ.test("Jeetu"));

    }
}
