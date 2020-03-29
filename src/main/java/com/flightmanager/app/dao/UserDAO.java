package com.flightmanager.app.dao;

import com.flightmanager.app.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author: Darius Gaurilka
 **/

public interface UserDAO {

    User save(User flight);
    User update(User flight);
    Optional<User> findById(long id);
    List<User> findAll();
    void deleteById(long id);

    User findByEmail(String email);
}
