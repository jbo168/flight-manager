package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.model.Customer;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    AbstractFactory customerFactory = ConcreteFactory.getFactory("Customer");

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login() {

        return "login";
    }

    @GetMapping(value = "/register")
    public String register(Model model){
//        model.addAttribute("register", customerFactory.getUser());
        model.addAttribute("customer", new Customer());
        return "register";
    }
    @RequestMapping(value = "/flights", method = RequestMethod.POST)
    public String createUser(Customer customer) {
        Customer newCustomer = userService.update(customer);
        return "redirect:/login";
    }

}
