package com.lld.lowleveldesign.solidpriciple.LiskovSubsitutionPrinciple;

public class Bicycle implements Bike{
    public void turnOnEngine() {
        throw new AssertionError("There is no Engine");
    }
    public void accelerate() {

    }
}
