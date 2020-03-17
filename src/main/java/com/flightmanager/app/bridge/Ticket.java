
//Abstract Bridge

package com.flightmanager.app.bridge;

public abstract class Ticket  {

    protected TicketImplementor myTicket;

    protected Ticket (TicketImplementor ticket){
        myTicket = ticket;
    }

    public Ticket() {

    }

    public abstract void checkReview();
    public abstract void addReview(String comment, int score);
    public abstract void updateStatus();

    public void getInfo(int bookingId){
        myTicket.getInfo(bookingId);
    }

}
