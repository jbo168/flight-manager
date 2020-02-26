package com.flightmanager.app.repository;

import com.flightmanager.app.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
}
