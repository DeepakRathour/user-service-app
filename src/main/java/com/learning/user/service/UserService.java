package com.learning.user.service;

import com.learning.user.model.User;
import com.learning.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        User user = new User("Akash", 25L, 9807234165L, 4, null);
        LOG.info("User Saved:{}", userRepository.save(user));
        return userRepository.findAll();
    }
}