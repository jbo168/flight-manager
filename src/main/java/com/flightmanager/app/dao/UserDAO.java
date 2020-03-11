package com.flightmanager.app.dao;

import com.flightmanager.app.model.Customer;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    Customer save(Customer flight);
    Customer update(Customer flight);
    Optional<Customer> findById(long id);
    List<Customer> findAll();
    void deleteById(long id);

    Customer findByEmail(String email);
}
