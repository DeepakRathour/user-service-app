package com.learning.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<?> getAllUsers() {
        System.out.println("No user found");
        return new ResponseEntity<>("There is no user now.", HttpStatus.OK);
    }
}
