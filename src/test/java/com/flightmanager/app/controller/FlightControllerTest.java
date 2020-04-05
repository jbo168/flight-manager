package com.flightmanager.app.controller;

import com.flightmanager.app.dao.FlightDAO;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.service.FlightService;
import com.flightmanager.app.serviceImpl.FlightServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import static org.mockito.Mockito.*;


import javax.inject.Inject;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(MockitoJUnitRunner.class)
class FlightControllerTest {
//    @Mock
//    private FlightDAO flightDAO;

    private FlightService flightService;


    private Flight createFlight(){
        Flight flight = new Flight();
        flight.setFlightId(0);
        flight.setAirline("Aer Lingus");
        flight.setRouteFrom("Dublin");
        flight.setRouteTo("Dubai");
        flight.setDate("21/07/2020");
        flight.setCost(1000);
        flight.setTickets(250);
        flight.setStatus("Pending Confirmation");

        return flight;
    }

    @Test
    void saveFlightTest(){
        Flight flight = createFlight();
//        flightService.save(flight);


//        verify(flightDAO).save(new Flight());
//        Optional<Flight> flightData = flightService.findById(0);
//        Flight testFlightData = flightData.get();

        assertEquals("Aer Lingus", flight.getAirline());
        assertEquals("Dublin", flight.getRouteFrom());
        assertEquals("Dubai", flight.getRouteTo());
        assertEquals("21/07/2020", flight.getDate());
        assertEquals(1000, flight.getCost());
        assertEquals(250, flight.getTickets());
        assertEquals("Pending Confirmation", flight.getStatus());

    }
}