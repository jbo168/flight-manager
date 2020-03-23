package com.flightmanager.app.service;

import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface FlightService {

    void save(Flight flight);
    Flight update(Flight flight);
    Optional<Flight> findById(int id);
    List<Flight> findAll();
    void deleteById(int id);

}
