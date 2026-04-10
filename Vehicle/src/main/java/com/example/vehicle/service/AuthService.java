package com.example.vehicle.service;

import com.example.vehicle.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {

    private List<User> users = new ArrayList<>();

    public String register(User user) {
        users.add(user);
        return "Registered";
    }

    public String login(User user) {
        for (User u : users) {
            if (u.getName().equals(user.getName())) {
                return "Login Success";
            }
        }
        return "Invalid User";
    }
}