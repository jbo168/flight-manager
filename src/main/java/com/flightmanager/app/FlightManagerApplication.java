package com.flightmanager.app;

import com.flightmanager.app.model.Customer;
import com.flightmanager.app.model.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class FlightManagerApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(FlightManagerApplication.class, args);
        Long id = 7L;

//        Customer customer = new Customer.CustomerBuilder().setFirstName("jim").build();
//        System.out.println(customer.getFirst_name());
    }

}
