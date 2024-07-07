package com.learning.user.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class User {

    private String name;
    private Long age;
    private Long phoneNo;
    private UserAddress address;
    private int userRating;

    public User() {
    }

    public User(String name, Long age, Long phoneNo, UserAddress address, int userRating) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.userRating = userRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", address=" + address +
                ", userRating=" + userRating +
                '}';
    }
}
