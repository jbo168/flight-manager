package com.flightmanager.app.forms;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;


public class Form1 implements FormHandler{

    private int luggage;
    private String ticketClass;
    private String extraRequest;

    @Autowired
    private FormHandler formHandler;

    @Override
    public void nextInChain(FormHandler handler) {
        this.formHandler = handler;
    }

    @Override
    public boolean process(BookingData bookingData) {
        bookingData.setLuggage(luggage);
        bookingData.setTicketClass(ticketClass);
        bookingData.setExtraRequest(extraRequest);
        return formHandler == null || formHandler.process(bookingData);
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public void setExtraRequest(String extraRequest) {
        this.extraRequest = extraRequest;
    }
}
