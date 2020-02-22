package com.flightmanager.app.controller;

import com.flightmanager.app.model.Flight;
import com.flightmanager.app.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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

    @GetMapping(value = "/flight/{id}")
    public String getFlight(@PathVariable int id, Model model){

        model.addAttribute("flight", flightService.getFlightById(id));

        return "flight";
    }

    @GetMapping(value = "/flight/add")
    public String addFlight(Model model){

        model.addAttribute("flight", new Flight());

        return "addUpdateFlight";
    }

    @RequestMapping(value = "/flight", method = RequestMethod.POST)
    public String addFlight(Flight flight) {

        Flight addedFlight = flightService.saveOrUpdateFlight(flight);

        return "redirect:/flight/" + addedFlight.getId();
    }

    @GetMapping(value = "flight/update/{id}")
    public String updateFlight(@PathVariable int id, Model model){

        model.addAttribute("flight", flightService.getFlightById(id));

        return "addUpdateFlight";
    }

    @GetMapping(value = "flight/remove/{id}")
    public String removeFlight(@PathVariable int id){

        flightService.removeFlight(id);

        return "redirect:/flights";
    }
}
