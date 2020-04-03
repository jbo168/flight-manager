package com.flightmanager.app.command;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@Component
public class CancelFlightCommand implements FlightCommand {

    @Autowired
    BookingService bookingService;

    private int flightId;

//    public CancelFlightCommand(int flightId){
//        this.flightId = flightId;
//    }

    @Override
    public void setBooking(Booking booking) {
        this.flightId = booking.getFlight_ID();
    }

    public void execute() {
        bookingService.deleteById(flightId);
    }
}
