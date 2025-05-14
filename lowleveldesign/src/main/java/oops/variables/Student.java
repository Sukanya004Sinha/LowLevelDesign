package oops.variables;

public class Student {
    public static void main(String[] args){
        Employee employeeObject = new Employee();
        employeeObject.emp_id= 20;
        modify(employeeObject);
        System.out.println(employeeObject.emp_id);


    }
    private static void modify(Employee employee){
        employee.emp_id= 20;
    }
}
