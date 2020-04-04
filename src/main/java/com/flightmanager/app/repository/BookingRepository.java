package com.flightmanager.app.repository;

import com.flightmanager.app.model.Booking;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: John Long
 * @create: 24-Feb-2020
 **/

public interface BookingRepository extends CrudRepository<Booking,Integer> {
}
