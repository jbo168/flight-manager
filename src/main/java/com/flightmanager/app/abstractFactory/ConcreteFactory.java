package com.flightmanager.app.abstractFactory;

import com.flightmanager.app.builder.CustomerUserBuilder;
import com.flightmanager.app.builder.UserDirector;
import com.stripe.model.Customer;

public class ConcreteFactory {

    public static AbstractFactory getFactory(boolean customer){
        if(customer)
            return new CustomerFactory();
        return null;
    }
    public static AbstractFactory getFactory(String systemType){
        if(systemType.equalsIgnoreCase("Admin"))
            return new SystemAdminFactory();
        else if(systemType.equalsIgnoreCase("Manager"))
            return new SystemManagerFactory();
        return null;
    }
}
