package com.flightmanager.app.command;

import com.flightmanager.app.model.Booking;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class BookFlightCommand implements FlightCommand {
    private Booking booking;

    public BookFlightCommand(Booking booking){
        this.booking = booking;
    }
    public void execute() {
        booking.book();
    }
}
