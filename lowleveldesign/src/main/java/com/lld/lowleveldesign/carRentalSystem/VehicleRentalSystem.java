package com.lld.lowleveldesign.carRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;
    VehicleRentalSystem(List<Store> stores, List<User> users){
        this.storeList = stores;
        this.userList = users;
    }
    public Store getStore(Location location){
        //based on location we will filter out the store from storeList
        return storeList.get(0);
    }
    //addUsers
    // remove users
    // add Stores
    // remove Stores
}
