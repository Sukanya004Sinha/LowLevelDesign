package com.lld.lowleveldesign.WithStrategy.Strategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Normal Drive Capability");
    }
}
