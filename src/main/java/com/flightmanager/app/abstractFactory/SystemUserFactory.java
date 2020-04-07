package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.SystemManagerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

/**
 * @author: Darius Gaurilka
 **/

public class SystemUserFactory extends AbstractFactory{

    @Override
    public UserBuilder getSystemAdminUser(String userType) {
            return new SystemAdminUserBuilder();
    }

    @Override
    public UserBuilder getSystemManagerUser(String userType) {
                 return new SystemManagerUserBuilder();
    }

    public UserBuilder getSystemUser(String userType){
        switch (userType){
            case "System": return getSystemAdminUser(userType);
            case "Manager":  return getSystemManagerUser(userType);
        }
        return null;
    }

    @Override
    public UserBuilder getUser() {
        return null;
    }
}
