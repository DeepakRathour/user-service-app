package com.learning.user.model;

public class UserAddress {
    private String addressId;
    private int floor;
    private String apartment;
    private String area;
    private String street;
    private Long pinCode;
    private String city;
    private String state;
    private String country;

    public UserAddress() {
    }

    public UserAddress(String addressId, int floor, String apartment, String area, String street, Long pinCode, String city, String state, String country) {
        this.addressId = addressId;
        this.floor = floor;
        this.apartment = apartment;
        this.area = area;
        this.street = street;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
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

    @Override
    public String toString() {
        return "UserAddress{" +
                "addressId='" + addressId + '\'' +
                ", floor=" + floor +
                ", apartment='" + apartment + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
