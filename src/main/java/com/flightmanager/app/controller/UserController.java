package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.model.User;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    AbstractFactory factory = ConcreteFactory.getFactory("Customer");

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(User user) {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout() {
        return "logout";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute(name="user") User user, Model model) {

        String email = user.getEmail();
        String password = user.getPassword();

        boolean isLoginValid = userService.validLogin(email, password);

        if(isLoginValid){
            return "redirect:/flights";
    }
        model.addAttribute("isLoginValid", "msg");
        return "login";
    }

    @GetMapping(value = "/register")
    public String register(Model model){
//        model.addAttribute("register", customerFactory.getUser()); = USING ABSTRACT
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user, Model model) {

        CustomerUserBuilder customer = (CustomerUserBuilder) factory.getUser();
        customer.buildFirstName(user.getFirst_name());
        customer.buildLastName(user.getLast_name());
        customer.buildEmail(user.getEmail());
        customer.buildContact(user.getContact());
        customer.buildPassword(user.getPassword());
        User user2 = customer.getUser();


        String email = user2.getEmail();
        boolean isRegisterValid = userService.validRegister(user2);

        if(userService.findByEmail(email) == null) {
            if (isRegisterValid) {
                userService.update(user2);
                return "redirect:/flights";
            }
            model.addAttribute("isRegisterValid", "msg");
            return "register";
        }
        model.addAttribute("emailExists", "Email already exists");
        return "register";
    }
}
