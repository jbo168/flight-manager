package com.flightmanager.app.visitor;

import com.flightmanager.app.model.Flight;

public class ServiceVisitor implements Visitor {

    @Override
    public int visit(Flight flight) {
        int cost = flight.getCost();
        cost = (int) (cost * 1.1)*100;
        return cost;
    }// Add service charge to flight
}
