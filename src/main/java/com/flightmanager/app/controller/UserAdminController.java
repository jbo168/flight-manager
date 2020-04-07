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
public class UserAdminController {

    @Autowired
    private UserService userService;

    AbstractFactory userFactory;

    @GetMapping(value = "/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @GetMapping(value = "/user/{id}")
    public String getUserById(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "user";
    }

    @GetMapping(value = "/user/add")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "addUpdateUser";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String saveUser(User user) {

        if (user.getAccount_type().length() < 1 || user.getAccount_type().equalsIgnoreCase("customer")) {
            userFactory = ConcreteFactory.getFactory("customer");
        } else{
            userFactory = ConcreteFactory.getFactory("system");
        }

        UserBuilder newUser = userFactory.getSystemAdminUser(user.getAccount_type());
        if(newUser == null){
            newUser = userFactory.getUser();
        }

        newUser.buildUserID(user.getUser_ID());
        newUser.buildFirstName(user.getFirst_name());
        newUser.buildLastName(user.getLast_name());
        newUser.buildEmail(user.getEmail());
        newUser.buildContact(user.getContact());
        newUser.buildPassword(user.getPassword());
        newUser.buildAccountType();

        if(userService.findByEmail(newUser.getUser().getEmail()) == null) {
            userService.update(newUser.getUser());
            return "redirect:/user/" + newUser.getUser().getUser_ID();
        }
        userService.update(newUser.getUser());
        return "redirect:/users";
    }

    @GetMapping(value = "user/update/{id}")
    public String updateUserInfo(@PathVariable int id, Model model){
        model.addAttribute("user", userService.findById(id));
        return "addUpdateUser";
    }

    @GetMapping(value = "user/remove/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteById(id);
        return "redirect:/users";
    }
}
