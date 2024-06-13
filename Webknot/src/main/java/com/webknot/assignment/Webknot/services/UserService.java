package com.webknot.assignment.Webknot.services;

import com.webknot.assignment.Webknot.models.User;
import com.webknot.assignment.Webknot.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    //private List<User> store =new ArrayList<>();
    @Autowired
    private userRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<User> getUser() {

        return userRepository.findAll();
    }

    public User CreateUser(User user){


        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(user.getRole());
        return userRepository.save(user);
    }


    public List<User> getAllUsersAsAdmin() {
        return userRepository.findAll();
    }

    public void deleteUserById(String id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        userRepository.deleteById(id);
    }
    public User createUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}