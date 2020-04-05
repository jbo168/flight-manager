package com.flightmanager.app.controller;

import com.flightmanager.app.abstractFactory.AbstractFactory;
import com.flightmanager.app.abstractFactory.ConcreteFactory;
import com.flightmanager.app.abstractFactory.UserFactory;
import com.flightmanager.app.builder.UserBuilder;
import com.flightmanager.app.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    // test commit
    AbstractFactory userFactory = ConcreteFactory.getFactory("customer");

    @Test
    void createUserTest() {
        UserBuilder customer = userFactory.getUser();
        customer.buildFirstName("John");
        customer.buildLastName("Long");
        customer.buildEmail("john@gmail.com");
        customer.buildContact("0858431032");
        customer.buildPassword("1234");
        customer.buildAccountType();
        User user = customer.getUser();

        assertEquals("John", user.getFirst_name());
        assertEquals("Long", user.getLast_name());
        assertEquals("john@gmail.com", user.getEmail());
        assertEquals("0858431032", user.getContact());
        assertEquals("1234", user.getPassword());
        assertEquals("Customer", user.getAccount_type());
    }
}