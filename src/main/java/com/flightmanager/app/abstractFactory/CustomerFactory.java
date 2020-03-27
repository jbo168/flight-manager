package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.builder.SystemAdminUserBuilder;
import com.flightmanager.app.builder.SystemManagerUserBuilder;
import com.flightmanager.app.builder.UserBuilder;

public class CustomerFactory extends AbstractFactory{

    @Override
    public UserBuilder getUser(String userType) {
        if(userType.equals("Customer")){
            return new CustomerUserBuilder();
        }
        else if(userType.equals("Admin")){
            return new SystemAdminUserBuilder();
        }
        else if(userType.equals("Manager")){
            return new SystemManagerUserBuilder();
        }
        return null;
    }
}
