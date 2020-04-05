package com.flightmanager.app.dao;

import com.flightmanager.app.model.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface BookingDAO {

    void save(Booking booking);
    Booking update(Booking booking);
    Optional<Booking> findById(int id);
    ArrayList<Booking> findAll();

    void deleteById(int bookingId);

    List<Booking> findBookingByUserAndFlight(int userId, int flightId);
}
