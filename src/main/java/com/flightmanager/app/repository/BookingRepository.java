package com.flightmanager.app.repository;

import com.flightmanager.app.model.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author: John Long
 * @create: 24-Feb-2020
 **/

public interface BookingRepository extends CrudRepository<Booking,Integer> {
    @Query("select b from Booking b " +
            "where b.user_ID = :userId " +
            "and b.flight_ID = :flightId")
    List<Booking> findByUserAndFlightId(@Param("userId") int userId, @Param("flightId") int flightId);
}
