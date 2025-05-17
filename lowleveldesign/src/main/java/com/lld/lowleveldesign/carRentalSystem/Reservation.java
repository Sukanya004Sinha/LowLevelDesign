package com.lld.lowleveldesign.carRentalSystem;

import com.lld.lowleveldesign.carRentalSystem.product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date datebookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;
    public int createReserve(User user, Vehicle vehicle){
        reservationId = 12222;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;

    }


}
