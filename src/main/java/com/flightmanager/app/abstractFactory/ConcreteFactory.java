package com.flightmanager.app.abstractFactory;

public class ConcreteFactory {

    public static AbstractFactory getFactory(String accType) {
        if(accType.equalsIgnoreCase("Customer"))
            return new UserFactory();
        else if(accType.equalsIgnoreCase("System"))
            return new SystemUserFactory();
        return null;
    }
}
