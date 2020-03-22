package com.flightmanager.app.command;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class CancelFlight implements FlightBooking{
    private Booking booking;

    public CancelFlight (Booking booking){
        this.booking = booking;
    }

    public void execute() {
        //TODO reduce number of seats booked on a particular flight by 1
    }
}
