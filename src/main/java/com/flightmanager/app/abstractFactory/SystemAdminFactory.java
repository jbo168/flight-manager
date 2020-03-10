package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemAdminBuilder;

public class SystemAdminFactory extends AbstractFactory{

    @Override
    public SystemAdminBuilder getUser(){
        return new SystemAdminBuilder();
    }
}
