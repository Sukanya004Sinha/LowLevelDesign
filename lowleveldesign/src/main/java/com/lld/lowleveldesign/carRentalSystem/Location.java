package com.lld.lowleveldesign.carRentalSystem;
public class Location {
    private int pincode;
    private String city;
    private String state;
    private String country;

    public Location(int pincode, String city, String state, String india) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
