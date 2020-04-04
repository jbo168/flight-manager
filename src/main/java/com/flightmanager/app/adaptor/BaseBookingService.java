package com.flightmanager.app.adaptor;

import com.flightmanager.app.model.Booking;


//Narrow Interface

public interface BaseBookingService {

    void setFlightId(int flightId);
    void setUserId(int userId);
    Booking getBooking();

}
