
//package com.flightmanager.app.bridge;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//public class Review extends Ticket {
//
//
//    private String comment;
//    private int score;
//
//    protected Review(TicketImplementor ticket) {
//        super(ticket);
//    }
//    protected Review(TicketImplementor ticket , String comment, int score) {
//        super(ticket);
//        this.comment = comment;
//        this.score = score;
//    }
//
//    @Override
//    public void checkReview() {
//       this.comment = "" ;
//    }
//
//    @Override
//    public void addReview(String comment , int score) {
//        this.comment = comment;
//        this.score = score;
//    }
//
//
//    public String getComment() {
//        return this.comment;
//    }
//
//
//    @Override
//    public void updateStatus() {
//        this.comment = "" ;
//    }
//}
//
//
