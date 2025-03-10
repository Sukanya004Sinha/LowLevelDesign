package com.lld.lowleveldesign.FactoryDesignPattern;

public class Main {
    public static void main(String args[]){
        ShapeFactory shapeFactoryObj = new ShapeFactory();

        Shape shapeObj1 = shapeFactoryObj.getShape("CIRCLE");
        if (shapeObj1 != null) {
            shapeObj1.draw();
        }

        Shape shapeObj2 = shapeFactoryObj.getShape("RECTANGLE");
        if (shapeObj2 != null) {
            shapeObj2.draw();
        }

        Shape shapeObj3 = shapeFactoryObj.getShape("SQUARE");
        if (shapeObj3 != null) {
            shapeObj3.draw();
        }
    }
}
/**
 * The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It is used to instantiate objects without exposing the instantiation logic to the client and refers to the newly created object through a common interface.
 * The ShapeFactory class has a method getShape that takes a string input and returns an object of the corresponding shape class.
 * The Main class demonstrates how to use the ShapeFactory to create and draw different shapes.
 * The if condition checks if the Shape object is not null before calling the draw method to avoid NullPointerException.
 */