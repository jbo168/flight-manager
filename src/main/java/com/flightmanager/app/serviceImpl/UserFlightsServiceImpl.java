package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.FlightDAO;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFlightsServiceImpl implements UserFlightsService {
    @Autowired
    FlightDAO flightDAO;

    @Override
    public String testMapping(){
        return "Working";
    }
    @Override
    public Flight displayFlights(){
        List<Flight> flightArray ;
            flightArray = flightDAO.findAll();
            return flightArray.get(0);
    }

}
