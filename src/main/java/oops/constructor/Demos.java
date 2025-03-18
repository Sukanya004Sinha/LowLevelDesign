package oops.constructor;

public class Demos{
    public static void main(String[] args){
        Humans obj = new Humans();
       Humans obj1 = new Humans(30, "Kartikey");
        System.out.println((obj.getName() + " : " + obj.getAge()));
        System.out.println((obj1.getName() + " : " +obj1.getAge()));
//        obj.setAge(30);
//        obj.setName("Kartik");

    }
}
