package com.manishgiri.springbootwebapp.controller;

import com.manishgiri.springbootwebapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    //LoginService loginService = new LoginService();

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    //@ResponseBody
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(loginService.validateUser(name, password)) {
            model.put("name", name);
            return "welcome";
        }
        else {
            String errorMessage = "Invalid credentials";
            model.put("error", errorMessage);
            return "login";
        }

        // return "welcome";
    }

}
