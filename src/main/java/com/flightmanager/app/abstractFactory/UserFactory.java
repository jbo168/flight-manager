package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.SystemManagerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

public class UserFactory extends AbstractFactory {
    @Override
    public UserBuilder getUser(String userType) {
        if(userType.equalsIgnoreCase("Customer")){
            return new CustomerUserBuilder();
        }
        else if(userType.equalsIgnoreCase("Admin")){
            return new SystemAdminUserBuilder();
        }
        else if(userType.equalsIgnoreCase("Manager")){
            return new SystemManagerUserBuilder();
        }
        return null;
    }
}
