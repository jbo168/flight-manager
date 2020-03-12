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
    private int flight_ID;
    private int customer_ID;

    public Booking() {
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
}
