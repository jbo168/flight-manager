package com.flightmanager.app.service;

import com.flightmanager.app.adaptor.BookingAdaptor;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public interface BookingService {

    Booking update(Booking booking);
    ArrayList<Flight> findAll(int i);
    ArrayList<Booking> returnBookings(int i);
    Optional<Booking> findByID(int i);

}
