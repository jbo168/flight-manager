package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.UserBuilder;

public class AdminFactory extends AbstractFactory{
    @Override
    public UserBuilder getUser() {
        return null;
    }

//    @Override
//    public AdminUserBuilder getUser(){
//        return new AdminUserBuilder();
//    }
}
