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
    AbstractFactory userFactory = ConcreteFactory.getFactory("customer");

    @Test
    void createCustomerUserTest() {
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

    @Test
    void createCustomerUserTest2() {
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

    @Test
    void createCustomerUserTest3() {
        UserBuilder customer = userFactory.getUser();
        customer.buildFirstName("John");
        customer.buildEmail("john@gmail.com");
        customer.buildPassword("1234");
        customer.buildAccountType();
        User user = customer.getUser();

        assertEquals("John", user.getFirst_name());
        assertEquals(null, user.getLast_name());
        assertEquals("john@gmail.com", user.getEmail());
        assertEquals(null, user.getContact());
        assertEquals("1234", user.getPassword());
        assertEquals("Customer", user.getAccount_type());
    }

    @Test
    void createCustomerUserTest4() {
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

    @Test
    void createSystemAdminUserTest() {
        UserBuilder systemAdmin = userFactory.getSystemAdminUser("System");
        systemAdmin.buildFirstName("John");
        systemAdmin.buildLastName("Long");
        systemAdmin.buildEmail("john@gmail.com");
        systemAdmin.buildContact("0858431032");
        systemAdmin.buildPassword("1234");
        systemAdmin.buildAccountType();
        User user = systemAdmin.getUser();

        assertEquals("John", user.getFirst_name());
        assertEquals("Long", user.getLast_name());
        assertEquals("john@gmail.com", user.getEmail());
        assertEquals("0858431032", user.getContact());
        assertEquals("1234", user.getPassword());
        assertEquals("Admin", user.getAccount_type());
    }

    @Test
    void createSystemManagerUserTest() {
        UserBuilder systemAdmin = userFactory.getSystemManagerUser("Manager");
        systemAdmin.buildFirstName("John");
        systemAdmin.buildLastName("Long");
        systemAdmin.buildEmail("john@gmail.com");
        systemAdmin.buildContact("0858431032");
        systemAdmin.buildPassword("1234");
        systemAdmin.buildAccountType();
        User user = systemAdmin.getUser();

        assertEquals("John", user.getFirst_name());
        assertEquals("Long", user.getLast_name());
        assertEquals("john@gmail.com", user.getEmail());
        assertEquals("0858431032", user.getContact());
        assertEquals("1234", user.getPassword());
        assertEquals("Manager", user.getAccount_type());
    }


}