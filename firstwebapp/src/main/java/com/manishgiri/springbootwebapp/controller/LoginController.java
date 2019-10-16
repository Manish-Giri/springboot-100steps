package com.manishgiri.springbootwebapp.controller;

import com.manishgiri.springbootwebapp.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    LoginService loginService = new LoginService();

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
        else
            return "login";
        // return "welcome";
    }

}
