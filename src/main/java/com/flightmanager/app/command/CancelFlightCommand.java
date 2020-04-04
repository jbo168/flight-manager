package com.flightmanager.app.command;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@Component
public class CancelFlightCommand implements FlightCommand {

    @Autowired
    BookingService bookingService;

    Booking booking;


    @Override
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void execute() {
        bookingService.deleteById(booking.getBooking_ID());
    }
}
