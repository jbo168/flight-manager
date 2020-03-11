package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.model.Customer;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    AbstractFactory customerFactory = ConcreteFactory.getFactory("Customer");

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute(name="customer") Customer customer) {

        String email = customer.getEmail();
        String password = customer.getPassword();

        Customer cust = userService.findByEmail(email);
        if(email.equals(cust.getEmail()) && password.equals(cust.getPassword())){
            return "flights";
        }
        return "index";
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
//        User newUser = new User.UserBuilder(user.getUsername(),user.getPassword(),user.getEmail(),user.getAccType())
//                .setFirstName(user.getFirstname())
//                .setLastName(user.getLastname())
//                .setContact(user.getContact()).build();
//
//        Customer customer = new Customer();
//        customer.setEmail(newUser.getEmail());
//        customer.setFirst_name(newUser.getFirstname());
//        customer.setLast_name(newUser.getLastname());
//        customer.setPassword(newUser.getPassword());
//        customer.setContact(newUser.getContact());
        return "flights";
    }

}
