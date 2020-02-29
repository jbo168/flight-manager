package com.flightmanager.app.controller;

import com.flightmanager.app.services.FlightService;
import com.flightmanager.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }


}