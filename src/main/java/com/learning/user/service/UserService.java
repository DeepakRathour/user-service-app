package com.learning.user.service;

import com.learning.user.model.User;
import com.learning.user.model.UserAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Akash", 25L, 9807234165L, new UserAddress(), 4));
        return users;
    }
}