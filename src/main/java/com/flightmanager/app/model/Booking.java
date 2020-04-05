package com.flightmanager.app.model;


import javax.persistence.*;


/// Adaptee


@Entity
@Table(name = "booking", schema = "flightdb")
public class Booking{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int booking_ID;
    private int flight_ID;
    private int user_ID;
    private String comment;
    private int score;

    public Booking() {super();}

    @Column(name = "booking_id")
    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    @Basic
    @Column(name = "flight_id")
    public int getFlight_ID() {
        return flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.flight_ID = flight_ID;
    }

    @Basic
    @Column(name = "user_id")
    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int customer_ID) {
        this.user_ID = customer_ID;
    }


    public void book(){
        // notify observers
    }

    @Basic
    @Column(name = "score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
