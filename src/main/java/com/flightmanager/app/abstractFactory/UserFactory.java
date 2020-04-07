package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.SystemManagerUserBuilder;
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
    public UserBuilder getSystemAdminUser(String userType) {
        return new SystemAdminUserBuilder();
    }

    @Override
    public UserBuilder getSystemManagerUser(String userType) {
        return new SystemManagerUserBuilder();
    }
}
