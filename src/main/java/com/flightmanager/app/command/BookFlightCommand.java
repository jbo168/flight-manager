package com.flightmanager.app.command;

import com.flightmanager.app.adaptor.BaseBookingService;
import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class BookFlightCommand implements FlightCommand {
    @Autowired
    BookingDAO bookingDAO;

    private Booking booking;

    public BookFlightCommand(Booking booking){
        this.booking = booking;
    }
    public void execute() {
//        booking.book();
        bookingDAO.save(booking);
    }
}
