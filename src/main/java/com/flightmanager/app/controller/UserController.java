package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    AbstractFactory customerFactory = ConcreteFactory.getFactory("Customer");

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login() {

        return "register";
    }

    @GetMapping(value = "/register")
    public String register(Model model){
        model.addAttribute("register", customerFactory.getUser());
        return "login";
    }

}
