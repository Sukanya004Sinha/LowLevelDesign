package com.lld.lowleveldesign.WithStrategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
