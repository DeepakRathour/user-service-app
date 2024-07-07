package com.learning.user.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String userId;
    @Column
    private String name;
    @Column
    private Long age;
    @Column
    private Long phoneNo;
    @Column
    private int userRating;
    @OneToOne(mappedBy = "userDetails", fetch = FetchType.EAGER)
    private UserAddress address;

    public User(String akash, long l, long l1, UserAddress userAddress, int i) {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", userRating=" + userRating +
                ", address=" + address +
                '}';
    }
}
