package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.FlightDAO;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightDAO flightDAO;

    @Override
    public void save(Flight flight) {
        flightDAO.save(flight);
    }

    @Override
    public Flight update(Flight flight) {
        return flightDAO.update(flight);
    }

    @Override
    public Optional<Flight> findById(int id) {
        return flightDAO.findById(id);
    }

    @Override
    public List<Flight> findAll() {
        return flightDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        flightDAO.deleteById(id);
    }
}
