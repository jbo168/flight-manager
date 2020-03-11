package com.flightmanager.app.repository;

import com.flightmanager.app.model.Customer;

public interface CustomCustomerRepository<T,S> {
    public Customer findByEmail(String email);
}
