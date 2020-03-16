package com.flightmanager.app.model;

import com.flightmanager.app.bridge.Review;
import com.flightmanager.app.bridge.Ticket;
import com.flightmanager.app.bridge.TicketImplementor;

import javax.persistence.*;
import java.awt.print.Book;


/// Rectangle


@Entity
//@Table(name="booking")
public class Booking extends Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name = "booking_ID")
    private int booking_ID;
    private int flight_ID;
    private int customer_ID;
    private String comment;
    private int score;

    public Booking(){
        super();
    }

    public Booking(TicketImplementor ticket) {
        super(ticket);
    }

    @Override
    public void getInfo(int booking_ID) {
        System.out.print("Booking");
    }

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

    @Override
    public void checkReview() {

    }

    @Override
    public void addReview(String comment, int score) {

    }

    @Override
    public void updateStatus() {

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
