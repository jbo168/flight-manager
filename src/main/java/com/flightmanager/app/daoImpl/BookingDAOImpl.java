package com.flightmanager.app.daoImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.BookingRepository;
import com.flightmanager.app.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

@Component
public class BookingDAOImpl implements BookingDAO {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    FlightRepository flightRepository;

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> findById(int id) {
        return bookingRepository.findById(id);
    }

    @Override
    public ArrayList<Booking> findAll() {
        ArrayList<Booking> bookings = (ArrayList<Booking>) bookingRepository.findAll();
        return bookings ;
    }


}
