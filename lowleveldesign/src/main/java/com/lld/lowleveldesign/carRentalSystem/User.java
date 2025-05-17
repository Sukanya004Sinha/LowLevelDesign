package com.lld.lowleveldesign.carRentalSystem;

public class User {
    int userId;
    String userName; // Changed from int to String
    int drivingLicense;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) { // Updated to accept String
        this.userName = userName;
    }

    public int getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(int drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void setName(String name) {
        this.userName = name;
    }
}