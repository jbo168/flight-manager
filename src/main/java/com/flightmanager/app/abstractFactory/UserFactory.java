package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

/**
 * @author: Darius Gaurilka
 **/

public class UserFactory extends AbstractFactory {
    @Override
    public UserBuilder getUser() {
        return new CustomerUserBuilder();
    }

    @Override
    public UserBuilder getSystemUser(String userType) {
        return null;
    }
}
