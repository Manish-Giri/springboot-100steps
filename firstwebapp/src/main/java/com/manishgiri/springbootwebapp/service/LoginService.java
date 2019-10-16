package com.manishgiri.springbootwebapp.service;

public class LoginService {

    public boolean validateUser(String username, String password) {
        return username.equalsIgnoreCase("user") && password.equalsIgnoreCase("password");
    }
}
