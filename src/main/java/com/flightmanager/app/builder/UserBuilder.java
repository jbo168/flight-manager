package com.flightmanager.app.builder;

import com.flightmanager.app.model.User;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public abstract class UserBuilder {
    protected User user;

    public User getUser(){
        return user;
    }

    public void createNewUserProduct(){
        user = new User();
    }
}
