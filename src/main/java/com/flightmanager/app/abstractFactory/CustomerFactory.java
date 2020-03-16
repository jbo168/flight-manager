package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.UserBuilder;

public class CustomerFactory extends AbstractFactory{

    @Override
    public UserBuilder getUser() {
        return null;
    }

//    @Override
//    public CustomerUserBuilder getUser(){
//            return new CustomerUserBuilder();
//    }

}
