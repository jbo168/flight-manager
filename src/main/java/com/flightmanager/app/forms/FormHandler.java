package com.flightmanager.app.forms;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import org.springframework.stereotype.Component;

@Component
public interface FormHandler {
    void nextInChain(FormHandler handler);
    boolean process(BookingData bookingData);
}
