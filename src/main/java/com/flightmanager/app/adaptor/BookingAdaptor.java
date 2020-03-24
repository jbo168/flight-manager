package com.flightmanager.app.adaptor;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.FlightRepository;
import com.flightmanager.app.service.BookingService;
import com.flightmanager.app.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//public class BirdAdapter implements ToyDuck {
public class BookingAdaptor implements ReviewService {

    public Booking booking;
    public String comment;
    public int score;

    public BookingAdaptor(Booking newBooking){
        this.booking = newBooking;
        this.comment = newBooking.getComment();
        this.score = newBooking.getScore();
    }

    @Override
    public String getComment(){
        return  booking.getComment() ;
    }

    @Override
    public int getScore() {
        return  booking.getScore();
    }

    @Override
    public void setComment(String comment) {
        booking.setComment(comment);
    }

    @Override
    public void setScore(int score) {
        booking.setScore(score);
    }





    //Call get review method


    // You need to implement the interface your
    // client expects to use.

   // Bird bird;


//    Flight flight;
//
//    public FlightAdaptor(Flight flight){
//        this.flight = flight;
//    }
//    public void getReview()
//    {
//        // translate the methods appropriately
//        flight.getAll(flight.getFlightId());
//    }
//
//    @Override
//    public Booking update(Booking booking) {
//        return null;
//    }
//
//    @Override
//    public ArrayList<Flight> findAll(int i) {
//        return null;
//    }
//
//    @Override
//    public ArrayList<Booking> returnBookings(int i) {
//        return null;
//    }
//
//    @Override
//    public Optional<Booking> findByID(int i) {
//        return Optional.empty();
//    }



}


//    public BirdAdapter(Bird bird)
//    {
//        // we need reference to the object we
//        // are adapting
//        this.bird = bird;
//    }

//    public void squeak()
//    {
//        // translate the methods appropriately
//        bird.makeSound();
//    }
