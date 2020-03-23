package com.flightmanager.app.adaptor;

public class Review implements ReviewService {

    public String comment;
    public int score;

//    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

//    @Override
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore(){ return score; };
    public String getComment(){ return comment; };
}
