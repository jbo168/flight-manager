package com.flightmanager.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteInterceptor implements Interceptor{


    Logger logger = LoggerFactory.getLogger(ConcreteInterceptor.class);

    @Override
    public void preMarshallRequest(AuthenticationObject context) {
        logger.info("Authentication initiated");
    }

    @Override
    public void postMarshallRequest(AuthenticationObject context) {
        if(context.getStatus() == true){
            logger.info("User: " + context.getUser() + " authenticated at: " + context.getDate() + " ;Log-in Status: " + context.getStatus());
        }
        else {
            logger.info("User: " + context.getUser() + " attempted to log-in at: " + context.getDate() + " ;Log-in Status:" + context.getStatus());
        }
    }

    @Override
    public void preMarshallReply(AuthenticationObject context) {
        logger.info("User log-out initiated");
    }

    @Override
    public void postMarshallReply(AuthenticationObject context) {
        logger.info("User: " + context.getUser() + " Logged-out at: " + context.getDate() + " ;Log-in status: " + context.getStatus());
    }
}
