package com.flightmanager.app.daoImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.repository.BookingRepository;
import com.flightmanager.app.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookingDAOImpl implements BookingDAO {

    @Autowired
    BookingRepository bookingRepository;

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
    public Optional<Booking> findById(int id) {
        return bookingRepository.findById(id);
    }
}
