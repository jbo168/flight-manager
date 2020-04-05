package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.builder.UserBuilder;
import com.flightmanager.app.model.User;
import com.flightmanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Darius Gaurilka
 **/

@Controller
public class UserController {

    AbstractFactory userFactory = ConcreteFactory.getFactory("customer");

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
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User registeringUser, Model model) {

        UserBuilder customer = userFactory.getUser();
        customer.buildFirstName(registeringUser.getFirst_name());
        customer.buildLastName(registeringUser.getLast_name());
        customer.buildEmail(registeringUser.getEmail());
        customer.buildContact(registeringUser.getContact());
        customer.buildPassword(registeringUser.getPassword());
        customer.buildAccountType();
        User user = customer.getUser();


        String email = user.getEmail();
        boolean isRegisterValid = userService.validRegister(user);

        if(userService.findByEmail(email) == null) {
            if (isRegisterValid) {
                userService.update(user);
                return "redirect:/flights";
            }
            model.addAttribute("isRegisterValid", "msg");
            return "register";
        }
        model.addAttribute("emailExists", "Email already exists");
        return "register";
    }
}
