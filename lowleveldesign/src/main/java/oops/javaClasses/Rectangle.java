package oops.javaClasses;

public class Rectangle extends Shape{
    public Rectangle(){
        System.out.println("Rectangle Constructor");

    }

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        int area = r.computeArea(10, 20);
        System.out.println(("Area of rectangle is :" + area));
    }
}

