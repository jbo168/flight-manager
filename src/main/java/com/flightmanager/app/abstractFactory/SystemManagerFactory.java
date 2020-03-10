package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemManagerBuilder;

public class SystemManagerFactory extends AbstractFactory{

    @Override
    public SystemManagerBuilder getUser(){
        return new SystemManagerBuilder();
    }
}
