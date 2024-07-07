package com.learning.user.model;

import jakarta.persistence.*;

@Entity
@Table
public class UserAddress {
    @Id
    @Column(name = "address_id")
    private String addressId;
    @Column
    private int floor;
    @Column
    private String apartment;
    @Column
    private String area;
    @Column
    private String street;
    @Column
    private Long pinCode;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "user_id")
    private User userDetails;

    public UserAddress() {
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

    public User getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
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
                ", userDetails=" + userDetails +
                '}';
    }
}
