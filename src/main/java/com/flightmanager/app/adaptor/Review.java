package com.flightmanager.app.adaptor;

//Adaptee

public class Review implements ReviewService {

    String comment;
    int score;

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore(){ return score; };
    public String getComment(){ return comment; };
}
