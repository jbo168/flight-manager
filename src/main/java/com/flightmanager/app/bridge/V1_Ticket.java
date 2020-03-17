package com.flightmanager.app.bridge;

import com.flightmanager.app.serviceImpl.UserFlightsServiceImpl;

public class V1_Ticket extends TicketImplementor {

    UserFlightsServiceImpl dp1;

    public void getInfo(int flightID){
        dp1.getInfo(flightID);
    }
}
