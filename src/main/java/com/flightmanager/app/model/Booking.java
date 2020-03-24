package com.flightmanager.app.model;


import javax.persistence.*;
import java.util.List;


/// Rectangle


@Entity
//@Table(name="booking")
public class Booking{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name = "booking_ID")
    private int booking_ID;
    private int flight_ID;
    private int customer_ID;
    public String comment;
    public int score;

    public Booking(Booking booking){
        super();
    }

    public Booking() {super();}


    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    public int getFlight_ID() {
        return flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.flight_ID = flight_ID;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }


    public void book(){
        // notify observers
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
