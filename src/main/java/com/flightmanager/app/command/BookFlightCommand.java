package com.flightmanager.app.command;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

@Component
@Primary
public class BookFlightCommand implements FlightCommand {
    @Autowired
    BookingDAO bookingDAO;

    private Booking booking;


    @Override
    public void setBooking(Booking booking){
        this.booking = booking;
    }

    public void execute() {
        bookingDAO.save(booking);
    }
}
