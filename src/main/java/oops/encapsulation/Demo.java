package oops.encapsulation;
class Human{
    private int age =10;
    private String name = "Sukanya";
    public int getAge(){
        return age;
    }
    public String getName(){
    return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
    public int setAge(int a){
        age= a;
        return age;
    }

}
public class Demo {
    public static void main(String[] args){
        Human obj = new Human();
         obj.setAge(30);
         obj.setName("Kartikey");
//        obj.age= 11;
//        obj.name= "Sukanya";
        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
