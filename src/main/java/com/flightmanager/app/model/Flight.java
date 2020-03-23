package com.flightmanager.app.model;

import com.flightmanager.app.bridge.FlightImplementor;

import javax.persistence.*;

//Flight Info

@Entity
@Table(name = "flight", schema = "flightdb")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;
    private String airline;
    private int cost;
    private String routeFrom;
    private String routeTo;
    private int tickets;
    private String departure;
    private String status;
//    private int first_class_tickets;




    @Column(name = "flight_id")
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    @Basic
    @Column(name = "airline")
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Basic
    @Column(name = "cost")
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "route_from")
    public String getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(String routeFrom) {
        this.routeFrom = routeFrom;
    }

    @Basic
    @Column(name = "route_to")
    public String getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }

    @Basic
    @Column(name = "tickets")
    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    @Basic
    @Column(name = "departure")
    public String getDate() {
        return departure;
    }

    public void setDate(String depart) {
        this.departure = depart;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public int getFirstClassTickets() {
//        return first_class_tickets;
//    }
//
//    public void setFirstClassTickets(int first_class_tickets) {
//        this.first_class_tickets = first_class_tickets;
//    }
}
