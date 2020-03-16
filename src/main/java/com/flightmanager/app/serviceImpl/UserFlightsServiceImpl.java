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
    public Optional<Booking> findByID(int i) {  return bookingDAO.findById(i); }

    public Booking update(Booking booking){ return bookingDAO.update(booking); }

    public void getInfo(int id){
        System.out.print("KK");
    }

    public ArrayList<Flight> findAll(int id) {
        ArrayList<Booking> bookings = bookingDAO.findAll();
        ArrayList<Integer> flightIds = new ArrayList<>();
        for(int i=0; bookings.size() > i ;i++){
            if(bookings.get(i).getCustomer_ID() == id) {
                flightIds.add(bookings.get(i).getFlight_ID());
            }
        }
        ArrayList<Flight> myFlight = (ArrayList<Flight>) flightRepository.findAllById(flightIds);
        return myFlight;
    }

    public ArrayList<Booking> returnBookings(int id){
        ArrayList<Booking> bookings = bookingDAO.findAll();
        ArrayList<Booking> bookingIds = new ArrayList<>();
        for(int i=0; bookings.size() > i ;i++){
            if(bookings.get(i).getCustomer_ID() == id) {
                bookingIds.add(bookings.get(i));
            }
        }
        return bookingIds;
    }


}
