package com.flightmanager.app.adaptor;

//Target Interface

public interface ReviewService {


    public void setComment(String comment);
    public void setScore(int score);
    public int getScore();
    public String getComment();

}
