package oops.staticvariableandclass;
class Mobile3{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand + " :"+ price+ " : " +name);
    }
    public static void show1(Mobile3 obj1){
        System.out.println("in static method");
        System.out.println(obj1.brand + " :"+ obj1.price+ " : " +name);
    }
}
public class Demo3 {
    public static void main(String[] args){
        Mobile3 obj1 = new Mobile3();
        obj1.brand = "Appple";
        obj1.price = 1000;
       Mobile3.name = "Iphone";
       Mobile3 obj2 = new Mobile3();
        obj2.brand = "Samsung";
        obj2.price = 10000;
        Mobile3.name = "Galaxy";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
