package com.lld.lowleveldesign.withoutStrateryDP;

import com.lld.lowleveldesign.WithStrategy.GoodsVehicle;
import com.lld.lowleveldesign.WithStrategy.OffRoadVehicle;
import com.lld.lowleveldesign.WithStrategy.Vehicle;

public class Main {
    public  static void main(String[] args){
      /**Vehicle vehicle = new OffRoadVehicle(); **/
        Vehicle vehicle = new GoodsVehicle()
;        vehicle.drive();
    }

}
