package com.flightmanager.app.service;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;

import java.util.Optional;

public interface UserFlightsService {
    String testMapping();
    Optional<Flight> displayFlights(int id);
}
