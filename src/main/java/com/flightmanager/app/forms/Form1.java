package com.flightmanager.app.forms;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;


public class Form1 implements FormHandler{

    @Autowired
    private FormHandler formHandler;

    @Override
    public void nextInChain(FormHandler handler) {
        this.formHandler = handler;
    }

    @Override
    public boolean process(BookingData bookingData) {
        bookingData.setTicketClass();
//        bookingData.setLuggage(false);
//        bookingData.setExtraRequest();
        return formHandler == null || formHandler.process(bookingData);
    }
}
