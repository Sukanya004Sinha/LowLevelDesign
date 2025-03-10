package com.lld.lowleveldesign.FactoryDesignPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch(input) {
            case "CIRCLE":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}