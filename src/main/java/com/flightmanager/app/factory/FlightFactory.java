package com.flightmanager.app.factory;

import com.flightmanager.app.model.Flight;

public class FlightFactory {
    public static Flight getFlight(){
        return new Flight();
    }
}
