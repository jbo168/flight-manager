package com.flightmanager.app.daoImpl;

import com.flightmanager.app.dao.FlightDAO;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FlightDAOImpl implements FlightDAO {

    @Autowired
    FlightRepository flightRepository;

    @Override
    public void save(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public Flight update (Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Optional<Flight> findById(int id) {
        return flightRepository.findById(id);
    }

    @Override
    public List<Flight> findAll() {
        List<Flight> flightList = (List<Flight>) flightRepository.findAll();
        return flightList;
    }

    @Override
    public void deleteById(int id) {
        flightRepository.deleteById(id);
    }


}
