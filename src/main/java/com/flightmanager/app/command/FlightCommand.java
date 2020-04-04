package com.flightmanager.app.command;

import com.flightmanager.app.model.Booking;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public interface FlightCommand {
    void setBooking(Booking booking);

    void execute();
}
