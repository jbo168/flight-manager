package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.UserBuilder;

public abstract class AbstractFactory {

    public abstract UserBuilder getUser();
    public abstract UserBuilder getSystemUser(String userType);

}
