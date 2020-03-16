package com.flightmanager.app.controller;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserFlightsController {

    @Autowired
    private UserFlightsService checkFlightsService;
    @Autowired
    private UserFlightsService checkBookingService;

        @GetMapping(value = "/userFlights")
        public String listFlights(Model model) {
        model.addAttribute("usersCurrentFlights", checkFlightsService.findAll(2));
        model.addAttribute("usersCurrentBooking" , checkFlightsService.returnBookings(2));
        return "userFlights";
        }

        @GetMapping(value = "/addReview/{id}")
        public String add(@PathVariable int id,Model model){
            model.addAttribute("booking", checkBookingService.findByID(id));
            return "addReview";
        }

        @PostMapping(value = "/userFlights")
        public String processReview(Booking booking){
            Booking addedReview = checkBookingService.update(booking);
            return "redirect:/userFlights";
        }

//
//        @RequestMapping(value = "/userFlights" , method= RequestMethod.GET)
//        public String processReview(Booking booking , ModelMap model) {
//           Booking addedReview = checkBookingService.update(booking);
//            return "submited";
//        }

}
