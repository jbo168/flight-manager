package com.flightmanager.app.service;

import com.flightmanager.app.model.Flight;

import java.util.List;
import java.util.Optional;

/**
 * @author: Darius Gaurilka
 **/

public interface FlightService {

    void save(Flight flight);
    Flight update(Flight flight);
    Optional<Flight> findById(int id);
    List<Flight> findAll();
    void deleteById(int id);

}
