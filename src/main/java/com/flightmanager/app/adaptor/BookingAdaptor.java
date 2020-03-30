package com.flightmanager.app.adaptor;


import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.service.BookingService;

//Pluggable Adaptor Option 1 from slides

public class BookingAdaptor implements ReviewService {

    public Booking booking;
    public String comment;
    public int score;

    public BookingAdaptor(Booking newBooking) {
        this.booking = newBooking;
        this.comment = newBooking.getComment();
        this.score = newBooking.getScore();
    }
//
//    public BookingAdaptor(BookingData data){
//        this.booking = data.get;
//        this.comment = newBooking.getComment();
//        this.score = newBooking.getScore();
//
//    }
//

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
}

    //Call get review method
    // need to implement the interface your
    // client expects to use.

