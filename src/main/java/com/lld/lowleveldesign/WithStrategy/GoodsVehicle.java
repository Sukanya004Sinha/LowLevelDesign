package com.lld.lowleveldesign.WithStrategy;

import com.lld.lowleveldesign.WithStrategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());

    }

}
