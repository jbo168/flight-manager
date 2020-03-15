package com.flightmanager.app.interceptor;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ConcreteInterceptor implements Interceptor{

    @Autowired
    Logger logger;

    @Override
    public void preMarshallRequest(AuthenticationObject context) {
        System.out.println("Authentication initiated");
    }

    @Override
    public void postMarshallRequest(AuthenticationObject context) {
        System.out.println("User logged-in at: " + context.getDate());
    }

    @Override
    public void preMarshallReply(AuthenticationObject context) {
        System.out.println("User log-out initiated");
    }

    @Override
    public void postMarshallReply(AuthenticationObject context) {
        Date logout = new Date();
        long time = logout.getTime();
        System.out.println("User logged-out at: " + context.getDate());
        System.out.println("User spent: " + (time - (context.getTime())) + " within the system");
    }

    public void onEvent(AuthenticationObject context){
        logger.logEvent(context);
    }
}
