package com.flightmanager.app.model;


public class BookingData {
    //luggage, address, extra request, class
    private int flight_id;
    private int userID;

    private int luggage;
    private String userEmail;
    private String address;
    private String ticketClass;
    private String extraRequest;

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getExtraRequest() {
        return extraRequest;
    }

    public void setExtraRequest(String extraRequest) {
        this.extraRequest = extraRequest;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }
}
