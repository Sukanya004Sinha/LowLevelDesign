package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    public static void main(String[] args) {
        //Streams
        //Java 8 --> minimal code, functional Programmibg
        //Java 8 --> Lambda expressions Date and time API
        //Lambda Expression -> is an anonymous function(no name, no return type no access modifier
        // Thread t1 = new Thread(new Task());
        Thread t1 = new Thread(() -> System.out.println("Hello"));


        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subOperation = (a, b) -> a + b;
        int result = subOperation.operate(2, 4);
        System.out.println(result);


//    class  Task implements Runnable{
//    @Override
//        public void run(){
//        System.out.println("Hello");
//    }
        /*****************************************************/
        //Predicate -> Functional Interface (Boolean valued function)
        // only stored confition inside a variable
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordsStartsWith = x -> x.startsWith("A");
        System.out.println(isWordsStartsWith.test("Andrew"));
        Predicate<String> isWordsEndWith = x -> x.endsWith("H");
        System.out.println(isWordsEndWith.test("SMITH"));
        Predicate<String> combined = isWordsStartsWith.and(isWordsEndWith);
        System.out.println(combined.test("AMITH"));
        /***********************************/
        Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> isNotEmpty = isEmpty.negate();
        Predicate<String> isNotEmptys = isEmpty.negate().negate();
        System.out.println(isEmpty.test(""));
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmptys.test(""));

        //use a predicate to find numbers > 10 and divisible by 2 in a list?
        List<Integer> nums = Arrays.asList(5, 8, 10, 15, 20, 23, 24, 25);
        Predicate<Integer> numbers = n -> n > 10 && n % 2 == 0;
        nums.stream().filter(numbers).forEach(System.out::println);
        //Functipn ---> work for you
        Function<Integer,Integer> doubleIt = x-> 2*x;
        Function<Integer,Integer> tripleIt = x-> 3*x;
        System.out.println(doubleIt.apply(100));
        System.out.println(tripleIt.apply(20));
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        Function<Integer,Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);
        //Consumer -> consumes something its accepts but it doenst return anything
        Consumer<Integer> print = x-> System.out.println(x);
        print.accept(54);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x->{
            for(int i : x){
                System.out.println(i);
            }
        };
        //Supplier= not accept anything but returns something
        Supplier<String> giveHelloWorld =() -> "Hello World";
        System.out.println(giveHelloWorld.get());
    }
    interface MathOperation {
        int operate(int a, int b);
    }
}
