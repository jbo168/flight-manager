package com.flightmanager.app.controller;

import com.flightmanager.app.chain.Form1;
import com.flightmanager.app.chain.Form2;
import com.flightmanager.app.delegate.CardDelegate;
import com.flightmanager.app.model.*;
import com.flightmanager.app.service.BookingService;
import com.flightmanager.app.service.FlightService;
import com.flightmanager.app.service.UserService;
import com.flightmanager.app.visitor.CostVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: John Long
 * @create: 15-Mar-2020
 **/
@Controller
public class BookingController {


    @Autowired
    private UserService checkUserService;
    @Autowired
    private BookingService checkBookingService;
    @Autowired
    private FlightService flightService;

    @GetMapping(value = "flight/bookFlight")
    public String index() {
        return "bookFlight";
    }

    @GetMapping(value = "/bookingForm1/{id}")
    public String form1Start(@PathVariable int id, Model model) {

        Form1 form1 = new Form1();
        form1.setFlight_id(id);

        model.addAttribute("form1" , form1);

        return "bookingForm1";

    }

    //Look into work flow pattern

    @PostMapping(value = "/bookingForm1")
    public String processData(Form1 form1){

        //Send Form1 to Handler
        checkBookingService.addHandler(form1);
        return "redirect:/bookingForm2";

    }

    @GetMapping(value = "/bookingForm2")
    public String form2Start(Model model) {

        Form2 form2 = new Form2();
        model.addAttribute("form2" , form2);

        return "bookingForm2";
    }

    @PostMapping(value = "/bookingForm2")
    public String processData2(Form2 form2){

        //Send Form2 to Handler
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        User currentUser = checkUserService.findByEmail(currentPrincipalName);

        form2.setUserID((int) currentUser.getUser_ID());

        checkBookingService.addHandler(form2);
        return "redirect:/pay";

    }

    @GetMapping("/pay")
    public String pay(Model model){

        BookingData data = checkBookingService.executeChain();

        if(flightService.findById(data.getFlight_id()).isPresent()) {
            Flight bookedFlight;
            bookedFlight = (flightService.findById(data.getFlight_id()).get());
            int flightCost = bookedFlight.getCost();
            int extraCharge = data.accept(new CostVisitor());
            int serviceCharge = bookedFlight.accept(new CostVisitor());
            model.addAttribute("flightCost", flightCost);
            model.addAttribute("extraCharges", extraCharge);
            model.addAttribute("serviceCharge", serviceCharge);
            model.addAttribute("total", flightCost + serviceCharge + extraCharge);
            model.addAttribute("card", new Card());
        }else{
            return "viewFlights";
        }



        return "noStripe";
    }

    @PostMapping("/processPayment")
    public String processPayment(Card card){
        card.setAuth(new CardDelegate(card));
        if (!card.validate()) return "noStripe";

        checkBookingService.adaptBookingData();

        return "redirect:/userFlights";
    }



}
