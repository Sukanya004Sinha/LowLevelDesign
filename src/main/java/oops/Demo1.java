package oops;

import org.springframework.javapoet.ClassName;

class Mobile1 {
    String brand;
    int price;
    String network;
    static String name;
    String color;
    String type;

 public Mobile1(){
     brand= "";
     price = 200;
     System.out.println("Mobile1 constructor");
 }
 static {
     name = "Phone";
        System.out.println("static block");
 }

    public void show() {
        System.out.println("brand: " + brand + ", price: " + price + " ,network:" + network + " ,name: " + name + " ,color:" + color + " ,type:" + type);
    }
}

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName( "Mobile1");
    }

//        Mobile1 m1 = new Mobile1();
//        m1.brand = "Samsung";
//        m1.price = 10000;
//        m1.network = "5G";
//
//        m1.color = "Black";
//        m1.type = "Touchscreen";
//
//        Mobile1 m2 = new Mobile1();
//        m2.brand = "ViVo";
//        m2.price = 11000;
//        m2.network = "5G";
//        // m2.name = "Smartphone";
//        m2.color = "Blue";
//        m2.type = "Touchscreen";
//
//        m1.show();
//        m2.show();

    }

