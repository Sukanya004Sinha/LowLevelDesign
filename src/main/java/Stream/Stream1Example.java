package Stream;

import java.util.ArrayList;
import java.util.Arrays;
            import java.util.List;
            import java.util.stream.Stream;

            public class Stream1Example {
                public static void main(String[] args) {
                    // List of employee salaries
                List<Integer> salaryList = new ArrayList<>();
               salaryList.add(3100);
               salaryList.add(4100);
                    salaryList.add(9000);
                    salaryList.add(1000);
                    salaryList.add(3500);
                long output = salaryList.stream().filter((Integer sal) -> sal > 3000 ) .count();
                    System.out.println("Total Employee with salary > 3000 "+output);

                    //Different ways to create a stream
                    //From Collection
                    Stream<Integer> salaryList1= salaryList.stream();
                     salaryList1.forEach(sal -> System.out.println("Salary: " +sal));
                     /**From Array**/
                    Integer[] salaryArray = {1000, 2000, 3000, 4000, 5000};
                    Stream<Integer> salaryStream = Arrays.stream(salaryArray);
                    salaryStream.forEach(sal-> System.out.println("Salary from Array:"+ sal));

                   /** From Static Method**/
                   Stream<Integer> StreamFromStaticMethod = Stream.of(1000, 2000, 3000, 4000,5000);
                   StreamFromStaticMethod.forEach(sal-> System.out.println("Salary From Static Method" + sal));

                  /** From Stream, using Builder**/
                 Stream.Builder<Integer> salaryBuilder= Stream.builder();
                 salaryBuilder.add(1000).add(2000).add(30000).add(40000).add(50000);
         Stream<Integer> streamFromStreamBuilder = salaryBuilder.build();

   /***From Stream Iterate **/
    Stream<Integer> StreamIterate = Stream.iterate(1000, (Integer n) -> n+1000).limit(5);
StreamIterate.forEach(sal -> System.out.println("Salary from Stream iterate: " +sal));
}
}