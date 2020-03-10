package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.ClientUserBuilder;

public class CustomerFactory extends AbstractFactory{

    @Override
    public ClientUserBuilder getUser(){
            return new ClientUserBuilder();
    }

}
