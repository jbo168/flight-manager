package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;

public class CustomerFactory extends AbstractFactory{

    @Override
    public CustomerUserBuilder getUser(){
            return new CustomerUserBuilder();
    }

}
