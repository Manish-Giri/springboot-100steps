package com.manishgiri.springbootwebapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String username, String password) {
        return username.equalsIgnoreCase("manish") && password.equalsIgnoreCase("password");
    }
}
