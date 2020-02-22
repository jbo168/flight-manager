package com.flightmanager.app.services;

import com.flightmanager.app.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> listAllFlights();
    Flight getFlightById(int id);
    Flight saveOrUpdateFlight(Flight flight);
    void removeFlight(int id);
}
