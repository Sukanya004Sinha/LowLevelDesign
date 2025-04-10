package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        // Adding some employees to the list
        employees.add(new Employee("Sukanya", 1, 50000));
        employees.add(new Employee("Kartik", 2, 60000));
        employees.add(new Employee("Charlie", 3, 40000));
        employees.add(new Employee("David", 4, 70000));

        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()))
                .collect(Collectors.toList());
        List<Employee> sortedEmployee1 = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);
        sortedEmployees.forEach((e) -> System.out.println("Employee Name: " + e.getName() + ", Salary: " + e.getSalary()));
        sortedEmployee1.forEach(System.out::println);    }
}
