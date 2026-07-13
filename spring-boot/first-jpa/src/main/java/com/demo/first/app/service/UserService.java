package com.demo.first.app.service;

import com.demo.first.app.exception.UserNotFoundException;
import com.demo.first.app.model.User;
import com.demo.first.app.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User createUser(User user) {
        logger.info("Creating user.... INFO");
        logger.debug("Creating user.... DEBUG");
        logger.trace("Creating user.... TRACE");
        logger.warn("Creating user.... WARN");
        logger.error("Creating user.... ERROR");

        return userRepository.save(user);
    }

    public User updateUser(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());
        User existing = userOptional.orElseThrow(() -> new UserNotFoundException("User With ID : " + user.getId() + " does not exist"));
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        return userRepository.save(existing);
    }

    public boolean deleteUser(int id) {
        if (!userRepository.existsById(id))
            throw new UserNotFoundException("User with ID: " + id + "does not exist");
        userRepository.deleteById(id);
        return true;
    }

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        if (users.isEmpty())
            throw new NullPointerException("No users found in the database");
         return users;
    }


    public User getUserById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with ID: " + id + "does not exist"));
    }

    public List<User> search(String name, String email) {
//        return userRepository.findByNameAndEmail(name, email);
        return userRepository.findByNameIgnoreCaseAndEmailIgnoreCase(name, email);
    }
}
