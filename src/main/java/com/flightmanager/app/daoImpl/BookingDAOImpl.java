package com.flightmanager.app.daoImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.BookingRepository;
import com.flightmanager.app.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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
        ///return bookingRepository.update();
        return booking;
    }

    @Override
    public Optional<Flight> findById(int id) {
         Optional <Booking> bookingIds = bookingRepository.findById(id);
         int flightId =  bookingIds.get().getFlight_ID();
         return flightRepository.findById(flightId);
    }
}
