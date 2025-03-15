package oops.encapsulation;


class Human1 {
    private int age;
    private String name;
    public Human1(){
        age = 12;
        name ="Sukanya"; //
        System.out.println("Constructor called");
    }
    public Human1(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Human1(int name){
        this.name = "Kartikey";
    }

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

public class Demo1 {
    public static void main(String[] args) {
        Human1 obj = new Human1();
//        obj.setAge(30);
//        obj.setName("Kartikey");
        System.out.println(obj.getName() + " " + obj.getAge());


    }

}
