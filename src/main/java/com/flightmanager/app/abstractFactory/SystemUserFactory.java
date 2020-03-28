package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.SystemManagerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

public class SystemUserFactory extends AbstractFactory{

    @Override
    public UserBuilder getSystemUser(String userType) {
        if(userType.equalsIgnoreCase("Admin")){
            return new SystemAdminUserBuilder();
        }
        else if(userType.equalsIgnoreCase("Manager")){
            return new SystemManagerUserBuilder();
        }
        return null;
    }

    @Override
    public UserBuilder getUser() {
        return null;
    }
}
