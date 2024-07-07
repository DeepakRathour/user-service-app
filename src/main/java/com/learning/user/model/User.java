package com.learning.user.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "user_details")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long userId;
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

    public User() {
    }

    public User(String name, Long age, Long phoneNo, int userRating, UserAddress address) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.userRating = userRating;
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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
