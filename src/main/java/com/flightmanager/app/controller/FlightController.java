package com.flightmanager.app.controller;

import com.flightmanager.app.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FlightController {

    private FlightService flightService;

    @Autowired
    public void setFlightService(FlightService flightService){
        this.flightService = flightService;
    }
    @GetMapping(value = "/flights")
    public String listFlights(Model model) {

        model.addAttribute("flights", flightService.listAllFlights());

        return "flights";
    }

}
