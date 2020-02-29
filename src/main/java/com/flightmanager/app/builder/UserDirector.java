package com.flightmanager.app.builder;

import com.flightmanager.app.model.User;

/**
 * @author: John Long
 * @create: 29-Feb-2020
 **/

public class UserDirector {
    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder ub){
        userBuilder = ub;
    }

    public User getUser(){
        return userBuilder.getUser();
    }

    public void constructUser(){
        userBuilder.createNewUserProduct();
    }
}
