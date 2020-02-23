package com.flightmanager.app.services;

import com.flightmanager.app.model.User;

public interface UserService {

    User findById(int id);
    User findByEmail(String email);

}
