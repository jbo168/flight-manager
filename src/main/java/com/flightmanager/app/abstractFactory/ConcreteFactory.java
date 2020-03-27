package com.flightmanager.app.abstractFactory;

public class ConcreteFactory {
    public static AbstractFactory getFactory(String userType){
        if(userType.equalsIgnoreCase("Admin"))
            return new SystemAdminFactory();
        else if(userType.equalsIgnoreCase("System"))
            return new SystemManagerFactory();
        else if(userType.equalsIgnoreCase("Customer"))
            return new CustomerFactory();
        else {
            return null;
        }
    }
}
