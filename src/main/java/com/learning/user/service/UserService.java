package com.learning.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    public List<?> getAllUsers() {
        LOG.info("there is no user in service");
        return new ArrayList<>();
    }
}
