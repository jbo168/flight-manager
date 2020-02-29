package com.flightmanager.app.service;

import com.flightmanager.app.model.User;

public interface UserService {

    User findById(int id);
    User findByEmail(String email);

}
