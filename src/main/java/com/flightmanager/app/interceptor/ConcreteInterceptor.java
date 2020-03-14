package com.flightmanager.app.interceptor;

import org.springframework.beans.factory.annotation.Autowired;

public class ConcreteInterceptor implements Interceptor{

    @Autowired
    Logger logger;

    @Override
    public void preMarshallRequest(AuthenticationObject context) {
        System.out.println("PreMarshallRequest");
    }

    @Override
    public void postMarshallRequest(AuthenticationObject context) {
        System.out.println("PostMarshallRequest");
    }

    @Override
    public void preMarshallReply(AuthenticationObject context) {
        System.out.println("PreMarshallReply");
    }

    @Override
    public void postMarshallReply(AuthenticationObject context) {
        System.out.println("PostMarshallReply");
    }

    public void onEvent(AuthenticationObject context){
        logger.logEvent(context);
    }
}
