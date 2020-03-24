package com.flightmanager.app.command;

public interface Subject {

    void notifyAllObservers();
    void attach(Observer observer);
}
