package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

public class SystemAdminFactory extends AbstractFactory{
//    @Override
//    public UserBuilder getUser() {
//        return null;
//    }

    @Override
    public SystemAdminUserBuilder getUser(){
        return new SystemAdminUserBuilder();
    }
}
