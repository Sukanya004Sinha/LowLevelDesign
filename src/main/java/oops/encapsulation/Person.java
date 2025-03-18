package oops.encapsulation;

/**
 * Encapsulation is a fundamental concept of object-oriented of programming that involves wrapping data members and members functions(methods) together into a single unit typically a class. This helps to protect the data from outside interference and misuse by restricting direct access to soe of the objects components .
 * in the provided example encapsulation s demonstrated by the person class. The data members name and age are private meaning they cannot accessed directly fro outside the class instead of public getter and setter methods are provided to access and modify these private fields
 */


public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
