package com.flightmanager.app.service;

import com.flightmanager.app.forms.FormHandler;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.model.Flight;

import java.util.ArrayList;
import java.util.Optional;

public interface BookingService {

    Booking update(Booking booking);
    ArrayList<Flight> findAll(int i);
    ArrayList<Booking> returnBookings(int i);
    Optional<Booking> findByID(int i);

    void addHandler(FormHandler newHandler);

    BookingData executeChain();
}
