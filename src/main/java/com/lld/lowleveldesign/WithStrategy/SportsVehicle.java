package com.lld.lowleveldesign.WithStrategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());

    }
}
