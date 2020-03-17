package com.flightmanager.app.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class Broker {
    public List<FlightBooking> bookingList = new ArrayList<>();

    public void takeFlightBooking(FlightBooking flightBooking){
        bookingList.add(flightBooking);
    }

    public void bookFlights(){
        for(FlightBooking flightBooking: bookingList){
            flightBooking.execute();
        }
        bookingList.clear();
    }
}