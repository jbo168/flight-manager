package com.flightmanager.app.visitor;

import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.model.Flight;

public class CostVisitor implements Visitor {

    @Override
    public int visitServiceCharge(Flight flight) {
        int cost = flight.getCost();
        cost = (int) (cost * 1.1);
//        cost *= 100; // calculate in cents for stripe
        return cost;
    }// Add service charge to flight

    @Override
    public int visitExtraCharge(BookingData bookingData) {
        int charge = bookingData.getLuggage()*20;

        switch (bookingData.getTicketClass()){
            case "First":   charge *= 1.25;
                            break;
            case "Business": charge *= 1.5;
                            break;
        }

        return charge;
    }
}
