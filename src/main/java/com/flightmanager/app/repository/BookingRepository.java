package com.flightmanager.app.repository;

import com.flightmanager.app.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Integer> {
}
