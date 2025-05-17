package com.lld.lowleveldesign.carRentalSystem;

import com.lld.lowleveldesign.carRentalSystem.product.Car;
import com.lld.lowleveldesign.carRentalSystem.product.Payment;
import com.lld.lowleveldesign.carRentalSystem.product.Vehicle;
import com.lld.lowleveldesign.carRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Vehicle Rental System...");

        List<User> users = addUsers();
        if (users.isEmpty()) {
            System.out.println("No users available.");
            return;
        }
        System.out.println("Users added: " + users.size());

        List<Vehicle> vehicles = addVehicles();
        System.out.println("Vehicles added: " + vehicles.size());

        List<Store> stores = addStores(vehicles);
        System.out.println("Stores added: " + stores.size());

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        // 0 users comes
        User user = users.get(0);
        System.out.println("User selected: " + user.getUserName());

        // 1. user search store on location
        Location location = new Location(560075, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);
        if (store == null) {
            System.out.println("No store found at the given location.");
            return;
        }
        System.out.println("Store found: " + store.storeId);

        // 2. get all vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);
        if (storeVehicles.isEmpty()) {
            System.out.println("No vehicles available for the selected type.");
            return;
        }
        System.out.println("Vehicles available: " + storeVehicles.size());

        // 3. Reserving the particular Vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));
        System.out.println("Reservation created with ID: " + reservation.reservationId);

        // 4. Generate the Bill
        Bill bill = new Bill(reservation);
        System.out.println("Bill generated with amount: " + bill.totalBillAmount);

        // 5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);
        System.out.println("Payment completed.");

        // 6. Trip completed, Submit the Vehicle and close the reservations
        store.completeReservation(reservation.reservationId);
        System.out.println("Reservation completed and vehicle returned.");
    }

    public static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleType(VehicleType.CAR);
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        return vehicles;
    }

    public static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        user1.setName("John Doe");
        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);
        stores.add(store1);
        return stores;
    }
}