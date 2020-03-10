package com.flightmanager.app.abstractFactory;

public class ConcreteFactory {
    public static AbstractFactory getFactory(String userType){
        if(userType.equalsIgnoreCase("Admin"))
            return new AdminFactory();
        else if(userType.equalsIgnoreCase("System"))
            return new SystemManagerFactory();
        else{
            return new CustomerFactory();
        }
    }
}
