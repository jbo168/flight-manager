package com.flightmanager.app.interceptor;

public class Logger {

    public void logEvent(AuthenticationObject context){
        System.out.println("Logged:" + context.getDescription());
    }
}
