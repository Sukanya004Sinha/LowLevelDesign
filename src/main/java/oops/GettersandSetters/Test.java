package oops.GettersandSetters;
class Human{
    private String name;
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Test {
    public static void main(String[] args){
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Sukanya");
        System.out.println((obj.getName()+ ": "+obj.getAge()));
    }
}
