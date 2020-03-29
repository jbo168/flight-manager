package com.flightmanager.app.factory;

import com.flightmanager.app.model.Flight;

/**
 * @author: Darius Gaurilka
 **/

public class FlightFactory {
    public static Flight getFlight(){
        return new Flight();
    }
}
