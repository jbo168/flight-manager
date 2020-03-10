package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.AdminUserBuilder;

public class AdminFactory extends AbstractFactory{

    @Override
    public AdminUserBuilder getUser(){
        return new AdminUserBuilder();
    }
}
