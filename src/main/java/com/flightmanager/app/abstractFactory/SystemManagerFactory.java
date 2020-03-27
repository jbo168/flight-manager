package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemManagerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

public class SystemManagerFactory extends AbstractFactory{
//    @Override
//    public UserBuilder getUser() {
//        return null;
//    }

    @Override
    public SystemManagerUserBuilder getUser(){
        return new SystemManagerUserBuilder();
    }
}
