package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.FlightRepository;
import com.flightmanager.app.service.UserFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserFlightsServiceImpl implements UserFlightsService {
    @Autowired
    FlightRepository flightRepository;
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

    public ArrayList<Flight> findAll(int id) {
        ArrayList<Booking> bookings = bookingDAO.findAll();
        ArrayList<Integer> flightIds = new ArrayList<Integer>();
        int size = 0 , test = 0;
        for(int i=0; bookings.size() > i ;i++){
            size =  bookings.get(i).getCustomer_ID();
            test = id;
            if(bookings.get(i).getCustomer_ID() == id) {
                flightIds.add(bookings.get(i).getFlight_ID());
            }
        }
        ArrayList<Flight> myFlight = (ArrayList<Flight>) flightRepository.findAllById(flightIds);
        return myFlight;
    }

}
