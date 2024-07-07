package com.learning.user.controller;

import com.learning.user.model.User;
import com.learning.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        LOG.info("Request received to get all users");
        List<User> userList = userService.getAllUsers();
        if (userList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        LOG.info("User List:{}", userList);
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        LOG.info("Request received to get user by id:{}", id);
        User user = userService.getUser(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>("User not found for given id", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> addUser(@Valid @RequestBody User user) {
        LOG.info("request received to add new user:{}", user);
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable Long id) {
        LOG.info("Request received to update userId:{}", id);
        User existingUser = userService.getUser(id);
        if (existingUser != null) {
            user.setUserId(id);
            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
        }
        return new ResponseEntity<>("User not found for given id", HttpStatus.NOT_FOUND);
    }
}