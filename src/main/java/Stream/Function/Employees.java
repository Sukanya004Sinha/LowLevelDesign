package Stream.Function;

public class Employees  {
    private String name;
    private double salary;

    // Constructor
    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " - " + salary;
    }
}
