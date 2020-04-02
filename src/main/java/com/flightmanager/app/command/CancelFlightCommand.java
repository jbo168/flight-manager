package com.flightmanager.app.command;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class CancelFlightCommand implements FlightCommand {

    @Autowired
    BookingService bookingService;

    private int flightId;

    public CancelFlightCommand(int flightId){
        this.flightId = flightId;
    }

    public void execute() {
        bookingService.deleteById(flightId);
    }
}
