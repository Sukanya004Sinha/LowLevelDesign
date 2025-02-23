package com.lld.lowleveldesign.WithStrategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }
    public void drive(){
        driveObject.drive();
    }
}
