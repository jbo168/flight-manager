package com.flightmanager.app.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class ConcreteFlightCommand {
    public List<FlightCommand> bookingList = new ArrayList<>();

    public void takeFlightBooking(FlightCommand flightBooking){
        bookingList.add(flightBooking);
    }

    public void bookFlights(){
        for(FlightCommand flightBooking : bookingList){
            flightBooking.execute();
        }
        bookingList.clear();
    }
}