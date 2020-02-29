package com.flightmanager.app.dao;

import com.flightmanager.app.model.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightDAO {

    void save(Flight flight);
    Flight update(Flight flight);
    Optional<Flight> findById(int id);
    List<Flight> findAll();
    void deleteById(int id);
}
