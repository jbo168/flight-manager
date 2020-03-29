package com.flightmanager.app.controller;

import com.flightmanager.app.adaptor.BookingAdaptor;
import com.flightmanager.app.adaptor.Review;
import com.flightmanager.app.adaptor.ReviewService;
import com.flightmanager.app.forms.Form1;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.model.User;
import com.flightmanager.app.service.BookingService;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

public class FormController {

    @Autowired
    private UserService checkUserService;
    @Autowired
    private BookingService checkBookingService;

    @GetMapping(value = "/formContactDetails")
    public String takeInput(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        User currentUser = checkUserService.findByEmail(currentPrincipalName);

//        try {
//            model.addAttribute("form1" , Model);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return "userFlights";

    }

    @PostMapping(value = "/Form2")
    public String processData(Form1 form1){

//      Send Form1 to Handler

        return "redirect:/userFlights";

    }

}
