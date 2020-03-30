package com.flightmanager.app.forms;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;


public class Form1 implements FormHandler{

    private int flight_id;
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
        bookingData.setFlight_id(flight_id);
        bookingData.setLuggage(luggage);
        bookingData.setTicketClass(ticketClass);
        bookingData.setExtraRequest(extraRequest);
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


    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public String getExtraRequest() {
        return extraRequest;
    }
    public void setExtraRequest(String extraRequest) {
        this.extraRequest = extraRequest;
    }
}
