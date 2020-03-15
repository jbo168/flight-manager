package com.flightmanager.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 15-Mar-2020
 **/
@Controller
public class BookingController {

    @GetMapping(value = "/bookFlight")
    public String index() {
        return "bookFlight";
    }

}
