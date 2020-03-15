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
    public String login(Customer customer) {
        userService.initiatePreRequest();

        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "logout";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute(name="customer") Customer customer, Model model) {

        String email = customer.getEmail();
        String password = customer.getPassword();

        boolean isLoginValid = userService.validLogin(email, password);

        if(isLoginValid){
            userService.initiatePostRequest();
            return "redirect:/flights";
        }
        model.addAttribute("isLoginValid", "msg");
        return "login";
    }

    @GetMapping(value = "/register")
    public String register(Model model){
//        model.addAttribute("register", customerFactory.getUser());
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createUser(@ModelAttribute Customer customer, Model model) {

        String email = customer.getEmail();
        boolean isRegisterValid = userService.validRegister(customer);

        if(userService.findByEmail(email) == null) {
            if (isRegisterValid) {
                userService.update(customer);
                return "redirect:/flights";
            }
            model.addAttribute("isRegisterValid", "msg");
            return "register";
        }
        model.addAttribute("emailExists", "Email already exists");
        return "register";
    }
}
