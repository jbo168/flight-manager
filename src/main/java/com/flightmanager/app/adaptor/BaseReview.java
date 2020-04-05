package com.flightmanager.app.adaptor;

public class BaseReview {

    private String text;
    private int score = 0 ;

    public int printScore() {
        return score;
    }

    public String printComment() {
        return text;
    }
}
