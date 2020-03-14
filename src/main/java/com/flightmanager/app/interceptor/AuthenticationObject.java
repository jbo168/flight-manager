package com.flightmanager.app.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthenticationObject {

    private long id;
    private String username;
    private boolean status;

    public AuthenticationObject(long id, String username, boolean status){
        this.id = id;
        this.username = username;
        this.status = status;
    }

    public String getDate(){
        DateFormat chosenFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return chosenFormat.format(date);
    }

    public String getDescription(){
        String result = "ID: " + id + "Username: " + "Status: " + status + "Dated: " + getDate();
        return result;
    }
}
