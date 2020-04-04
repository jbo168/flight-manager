package com.flightmanager.app.adaptor;

import com.flightmanager.app.model.Booking;

//Pluggable Adaptor Option 1 from slides

public class BookingAdaptor implements ReviewService,BaseBookingService {

    Booking booking;
    String comment;
    int score;

    public BookingAdaptor(Booking newBooking) {
        this.booking = newBooking;
        this.comment = newBooking.getComment();
        this.score = newBooking.getScore();
    }

    public BookingAdaptor(int flightId, int userId){
        this.booking = new Booking();
        this.booking.setFlight_ID(flightId);
        this.booking.setUser_ID(userId);
    }

    @Override
    public String getComment() {
        return booking.getComment();
    }

    @Override
    public int getScore() {
        return booking.getScore();
    }

    @Override
    public void setComment(String comment) {
        booking.setComment(comment);
    }

    @Override
    public void setScore(int score) {
        booking.setScore(score);
    }

    //Booking Data Adapted

    public Booking getBooking(){
        return this.booking;
    }

    @Override
    public void setFlightId(int flightId) {
        booking.setFlight_ID(flightId);
    }

    @Override
    public void setUserId(int userId) {
        booking.setUser_ID(userId);
    }
}

    //Call get review method
    // need to implement the interface your
    // client expects to use.

