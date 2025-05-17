package oops.variables.salesDepartment;

public class Invoice {
    public void getInvoice(){
        System.out.println("Inside Invoice method");
        return;
    }
    public void printInvoice(){
        getInvoice();
        System.out.println("Inside Invoice method");
    }
}
