package com.flightmanager.app.command;

public interface Subject {

    public void notifyAllObservers();
    public void attach(Observer observer);
}
