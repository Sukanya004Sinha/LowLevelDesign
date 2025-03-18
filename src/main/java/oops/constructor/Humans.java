package oops.constructor;

/**
 * Constructor is a special method which has same name as a class name. A constructor never returns anything you dont have to specify int string
 */
public class Humans {
    private int age;
    private String name;


//    public Humans(){
//        System.out.println("In constructor"); //default constructor
//        age = 30;
//        name = "Sukanya";
//    }
//    public Humans(int a, String n){ //Parameterized constructor
//        age = a;
//        name = n;
//    }

    public Humans() {
        age = 30;
        name = "Sukanya";
    }

    public Humans(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * if we will not write any constructor then java will provide a default constructor
     * @return
     */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
