package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.dao.BookingDAO;
import com.flightmanager.app.forms.FormHandler;
import com.flightmanager.app.model.Booking;
import com.flightmanager.app.model.BookingData;
import com.flightmanager.app.model.Flight;
import com.flightmanager.app.repository.FlightRepository;
import com.flightmanager.app.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    BookingDAO bookingDAO;

    BookingData data;
    List<FormHandler> handlers = new ArrayList<>();

    @Override
    public Optional<Booking> findByID(int i) {  return bookingDAO.findById(i); }

    public Booking update(Booking booking){ return bookingDAO.update(booking); }

    public ArrayList<Flight> findAll(int id) {

        ArrayList<Booking> bookings = bookingDAO.findAll();
        ArrayList<Integer> flightIds = new ArrayList<>();

        for(int i=0; bookings.size() > i ;i++){
            if(bookings.get(i).getUser_ID() == id) {
                flightIds.add(bookings.get(i).getFlight_ID());
            }
        }
        ArrayList<Flight> myFlight = (ArrayList<Flight>) flightRepository.findAllById(flightIds);

        //Push Flight into Adaptors

        return myFlight;
    }

    public ArrayList<Booking> returnBookings(int id){
        ArrayList<Booking> bookings = bookingDAO.findAll();
        ArrayList<Booking> bookingIds = new ArrayList<>();
        for(int i=0; bookings.size() > i ;i++){
            if(bookings.get(i).getUser_ID() == id) {
                bookingIds.add(bookings.get(i));
            }
        }
        return bookingIds;
    }

    @Override
    public void addHandler(FormHandler newHandler){
            handlers.add(newHandler);
            if(handlers.size() > 1)
                handlers.get(handlers.size()-2).nextInChain(newHandler);
    }

    @Override
    public BookingData executeChain(){
        BookingData data = new BookingData();
        handlers.get(0).process(data);

        this.data = data;
        return data;
    }

    public BookingData getData() {
        return data;
    }
}
