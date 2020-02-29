package com.flightmanager.app.repository;

import com.flightmanager.app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: John Long
 * @create: 24-Feb-2020
 **/

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
