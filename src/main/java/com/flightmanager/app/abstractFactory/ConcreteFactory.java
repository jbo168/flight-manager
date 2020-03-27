package com.flightmanager.app.abstractFactory;

public class ConcreteFactory {

    public static AbstractFactory getFactory() {
            return new UserFactory();
    }
}
