package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.dao.FlightDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFlightsServiceImpl implements UserFlightsService {

    @Autowired
    BookingDAO bookingDAO;

    @Override
    public String testMapping(){
        return "Working";
    }
    @Override
    public Optional<Flight> displayFlights(int id){
            return bookingDAO.findById(id);
    }

}
