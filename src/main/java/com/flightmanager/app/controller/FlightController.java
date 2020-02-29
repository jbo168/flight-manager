package com.flightmanager.app.controller;

import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlightController {

    @Autowired
    private FlightService flightsService;

        @GetMapping(value = "/flights")
        public String listFlights(Model model) {
            model.addAttribute("flights", flightsService.findAll());
            return "flights";
        }

        @GetMapping(value = "/flight/{id}")
        public String getFlight(@PathVariable int id, Model model) {
            model.addAttribute("flight", flightsService.findById(id));
            return "flight";
        }

        @GetMapping(value = "/flight/add")
        public String newFlight(Model model){
            model.addAttribute("flight", new Flight());
            return "addUpdateFlight";
        }

        @RequestMapping(value = "/flight", method = RequestMethod.POST)
        public String saveFlight(Flight flight) {
            Flight addedFlight = flightsService.update(flight);
            return "redirect:/flight/" + addedFlight.getFlightId();
        }

        @GetMapping(value = "flight/update/{id}")
        public String updateFlight(@PathVariable int id, Model model){
            model.addAttribute("flight", flightsService.findById(id));
            return "addUpdateFlight";
        }

        @GetMapping(value = "flight/remove/{id}")
        public String removeFlight(@PathVariable int id){
            flightsService.deleteById(id);
            return "redirect:/flights";
        }
}


