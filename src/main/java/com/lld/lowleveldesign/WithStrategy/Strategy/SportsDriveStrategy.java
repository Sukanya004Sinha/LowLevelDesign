package com.lld.lowleveldesign.WithStrategy.Strategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Sports drive capability");
    }
}
