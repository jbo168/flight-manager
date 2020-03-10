package com.flightmanager.app.controller;

import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserFlightsController {

    @Autowired
    private UserFlightsService checkFlightsService;

    @GetMapping(value = "/userFlights")
    public String testMapping(Model model) {
        model.addAttribute("testMessage", checkFlightsService.testMapping());
        return "userFlights";
    }

//    @GetMapping(value = "/checkFlights")
//    public String listFlights(Model model) {
//        model.addAttribute("checkFlights", checkFlightsService.displayFlights());
//        return "userFlights";
//    }

}
