package com.flightmanager.app.visitor;

import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.model.Flight;

public interface Visitor {
    int visitServiceCharge(Flight flight)// Add service charge to flight
    ;

    int visitExtraCharge(BookingData bookingData);
}
