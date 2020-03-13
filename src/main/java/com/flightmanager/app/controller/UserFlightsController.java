package com.flightmanager.app.controller;

import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserFlightsController {

//    @RequestMapping(method = RequestMethod.POST){
//        String post(){
//            return "Posted";
//        }
//    }
    @Autowired
    private UserFlightsService checkFlightsService;


//    @GetMapping(value = "/userFlights")
//    public String testMapping(Model model) {
//        model.addAttribute("testMessage", checkFlightsService.testMapping());
//        return "userFlights";
//    }

//    @GetMapping(value = "/userFlights")
//    public String listFlights(Model model) {
//        model.addAttribute("usersCurrentFlights", checkFlightsService.displayFlights(1));
//        return "userFlights";
//    }
        @GetMapping(value = "/userFlights")
        public String listFlights(Model model) {
            model.addAttribute("usersCurrentFlights", checkFlightsService.findAll(2));
            return "userFlights";
        }




}
