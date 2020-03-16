package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.UserBuilder;

public class SystemManagerFactory extends AbstractFactory{
    @Override
    public UserBuilder getUser() {
        return null;
    }

//    @Override
//    public SystemManagerBuilder getUser(){
//        return new SystemManagerBuilder();
//    }
}
