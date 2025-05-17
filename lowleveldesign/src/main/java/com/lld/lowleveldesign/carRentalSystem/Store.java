package com.lld.lowleveldesign.carRentalSystem;

import com.lld.lowleveldesign.carRentalSystem.product.Vehicle;
import com.lld.lowleveldesign.carRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagment;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();
    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryManagment.getVehicles();

    }
    //addVehicles, updateVehicles use inventory management to update those
    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagment = new VehicleInventoryManagement(vehicles);

    }
    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return  reservation;
    }
    public boolean completeReservation(int reservationID){
        //take out the reservation from the list and call complete the reservation method
        return true;

    }



}
