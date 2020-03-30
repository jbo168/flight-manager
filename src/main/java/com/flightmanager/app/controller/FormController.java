package com.flightmanager.app.controller;

import com.flightmanager.app.forms.Form1;
import com.flightmanager.app.forms.Form2;
import com.flightmanager.app.forms.FormHandler;
import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.model.User;
import com.flightmanager.app.service.BookingService;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {
//
//    @Autowired
//    private UserService checkUserService;
//    @Autowired
//    private BookingService checkBookingService;
//
//    @GetMapping(value = "/bookingForm1/{id}")
//    public String form1Start(@PathVariable int id,Model model) {
////
////        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
////        String currentPrincipalName = authentication.getName();
////        User currentUser = checkUserService.findByEmail(currentPrincipalName);
//
//        Form1 form1 = new Form1();
//        form1.setFlight_id(id);
//
//        model.addAttribute("form1" , form1);
//
//        return "bookingForm1";
//
//    }
//
//    @PostMapping(value = "/bookingForm1")
//    public String processData(Form1 form1){
//
//        //Send Form1 to Handler
//        checkBookingService.addHandler(form1);
//        return "redirect:/bookingForm2";
//
//    }
//
//    @GetMapping(value = "/bookingForm2")
//    public String form2Start(Model model) {
//
//        Form2 form2 = new Form2();
//        model.addAttribute("form2" , form2);
//
//        return "bookingForm2";
//    }
//
//    @PostMapping(value = "/bookingForm2")
//    public String processData2(Form2 form2){
//
//        //Send Form1 to Handler
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentPrincipalName = authentication.getName();
//        User currentUser = checkUserService.findByEmail(currentPrincipalName);
//
//        form2.setUserID((int) currentUser.getUser_ID());
//
//        checkBookingService.addHandler(form2);
//        return "redirect:/pay";
//
//    }



}
