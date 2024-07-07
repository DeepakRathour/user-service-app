package com.learning.user.service;

import com.learning.user.model.User;
import com.learning.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        if (users.isEmpty()) {
            LOG.info("User list is empty");
            return null;
        }
        LOG.info("Get user list:{}", users);
        return users;
    }

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id.toString());
        if (user.isPresent()) {
            LOG.info("Get user by user-id:{}", user.get());
            return user.get();
        }
        LOG.error("User not found for given user-id:{}", id);
        return null;
    }

    public User addUser(User user) {
        User addedUser = userRepository.save(user);
        LOG.info("User added successfully:{}", addedUser);
        return addedUser;
    }

    public User updateUser(User user) {
        User updatedUser = userRepository.save(user);
        LOG.info("User updated successfully:{}", updatedUser);
        return updatedUser;
    }
}