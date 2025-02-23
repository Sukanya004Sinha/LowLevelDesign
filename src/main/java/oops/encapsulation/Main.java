package oops.encapsulation;

public class Main {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Sukanya");
        p.setAge(20);
        System.out.println("Name: " +p.getName());
        System.out.println("Age: "+ p.getAge());
    }
}
