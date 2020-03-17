package com.flightmanager.app.command;

import com.flightmanager.app.model.Booking;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class BuyFlight implements FlightBooking{
    private Booking booking;

    public BuyFlight(Booking booking){
        this.booking = booking;
    }
    public void execute() {
        booking.book();
    }
}
