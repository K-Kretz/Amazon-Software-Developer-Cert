package com.amazon.security_with_registration.service;

import com.amazon.security_with_registration.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> users = new HashMap<>();
    private final PasswordEncoder passwordEncoder;


    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(User user){
        //encodes passsword before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.put(user.getUsername(),user); //store user in the map
    }

    public User findByUsername(String username){
        return users.get(username);
    }

    public Map<String,User> getAllUsers(){
        return users;
    }
}
