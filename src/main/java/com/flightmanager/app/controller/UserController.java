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
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute(name="customer") Customer customer, Model model) {

        String email = customer.getEmail();
        String password = customer.getPassword();

        boolean isLoginValid = userService.validLogin(email, password);

        if(isLoginValid){
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

}
