package com.flightmanager.app.visitor;

import com.flightmanager.app.model.Flight;

public class ServiceVisitor implements Visitor {

    @Override
    public int visit(Flight flight) {
        int cost = flight.getCost();
        cost = (int) (cost * 1.1);
//        cost *= 100; // calculate in cents for stripe
        return cost;
    }// Add service charge to flight
}
