package com.flightmanager.app.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthenticationObject {

    private String username;
    private boolean status;

    public AuthenticationObject(String username, boolean status){
        this.username = username;
        this.status = status;
    }
    public String getDate(){
        DateFormat chosenFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return chosenFormat.format(date);
    }

    public long getTime(){
        Date date = new Date();
        long time = date.getTime();
        return time;
    }

    public String getUser(){
        return username;
    }

    public boolean getStatus(){
        return status;
    }
}
