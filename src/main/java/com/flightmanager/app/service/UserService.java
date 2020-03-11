package com.flightmanager.app.service;

import com.flightmanager.app.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {

    void save(Customer flight);
    Customer update(Customer flight);
    Optional<Customer> findById(long id);
    List<Customer> findAll();

    Customer findByEmail(String email);

    void deleteById(long id);
}
