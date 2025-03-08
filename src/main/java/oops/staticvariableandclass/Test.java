package oops.staticvariableandclass;

/**
 * Static variable is actually shared by all the objects of the class. basically we do not have individual static variable for each object.
 * Static variable is used to refer the common property of all objects (that is not unique for each object), for example, company name of employees, college name of students etc.
 * Static variable gets memory only once in class area at the time of class loading.
 * static variable belongs to the class rather than the object of the class.
 * static variable is shared among all objects of the class.
 * static variable is initialized only once.
 * static variable can be called directly with the class name.
 * static variable can be accessed by calling with the class name ClassName.variableName.
 * static variable can be accessed by calling with the object reference also but it is not a good programming practice.
 */
class Mobile {
    String brand;
    int price;
    String network;
   static String name;
    String color;
    String type;

    public static void show1(Mobile3 obj1) {
    }


    public void show() {
    System.out.println("brand: "+ brand +  ", price: " + price + " ,network:" +  network + " ,name: " +  name + " ,color:" + color+" ,type:" + type);
}

}

class Test {
    public static void main(String[] args){

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 10000;
        m1.network = "5G";
        Mobile.name = "Smartphone";
        m1.color = "Black";
        m1.type="Touchscreen";

        Mobile m2 = new Mobile();
        m2.brand = "ViVo";
        m2.price = 11000;
        m2.network = "5G";
       // m2.name = "Smartphone";
        m2.color = "Blue";
        m2.type="Touchscreen";
        Mobile.name = "MobilePhone";
        m1.show();
        m2.show();

    }

}
