package com.flightmanager.app.forms;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;


public class Form1 implements FormHandler{

    private int luggage;
    private String ticketClass;

    @Autowired
    private FormHandler formHandler;

    @Override
    public void nextInChain(FormHandler handler) {
        this.formHandler = handler;
    }

    @Override
    public boolean process(BookingData bookingData) {

        return formHandler == null || formHandler.process(bookingData);
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }
}
