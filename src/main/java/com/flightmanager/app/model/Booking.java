package com.flightmanager.app.model;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 19-Feb-2020
 **/
@Entity
//@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name = "booking_ID")
    private int booking_ID;

    public Booking() {
    }

    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }
}
