package com.lld.lowleveldesign.solidpriciple.LiskovSubsitutionPrinciple;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;
    public void turnOnEngine() {
        //turn on Engine
        isEngineOn = true;
    }
    public void accelerate() {
        speed=speed+10;
    }
}

