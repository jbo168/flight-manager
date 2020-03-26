package com.flightmanager.app.repository;

import com.flightmanager.app.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: John Long
 * @create: 24-Feb-2020
 **/

public interface CustomerRepository extends CrudRepository<User, Long> {
    public User findByEmail(String email);
}
