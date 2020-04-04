package com.flightmanager.app.adaptor;

//Narrow Adaptee Interface need be able to set score

//Adapter

public interface ReviewService {

    public void setComment(String comment);
    public String getComment();
    public void setScore(int score);
    public int getScore();

}
