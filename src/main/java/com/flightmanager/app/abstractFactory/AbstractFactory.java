package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.UserBuilder;

/**
 * @author: Darius Gaurilka
 * **/

public abstract class AbstractFactory {

    public abstract UserBuilder getUser();
    public abstract UserBuilder getSystemAdminUser(String userType);
    public abstract UserBuilder getSystemManagerUser(String userType);

}
