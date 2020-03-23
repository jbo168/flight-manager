package com.flightmanager.app.command;

import com.flightmanager.app.model.Booking;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class CancelFlightCommand implements FlightCommand {
    private Booking booking;

    public CancelFlightCommand(Booking booking){
        this.booking = booking;
    }

    public void execute() {
        //TODO remove flight booking from list of booked flights
    }
}
