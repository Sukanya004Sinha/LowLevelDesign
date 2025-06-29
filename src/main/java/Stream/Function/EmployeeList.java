package Stream.Function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Sukanya", 75000),
                new Employees("Amit", 60000),
                new Employees("Ravi", 85000),
                new Employees("Neha", 65000)
        );
        List<Employees> sortedList = employees.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).
                collect(Collectors.toList());
        System.out.println(sortedList);


    }
}
