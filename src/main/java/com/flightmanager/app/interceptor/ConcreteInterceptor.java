package com.flightmanager.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteInterceptor implements Interceptor{

    Logger logger = LoggerFactory.getLogger(ConcreteInterceptor.class);

    PriorityThread priorityThread = new PriorityThread();

    @Override
    public void preMarshallRequest(AuthenticationAndLogoutContext context) {
        priorityThread.run();
        priorityThread.setPriority(3);
        logger.info("Authentication initiated  ;Log-in Status: " + context.getStatus() + " ;Priority Level: " +
                priorityThread.getPriority());
    }

    @Override
    public void postMarshallRequest(AuthenticationAndLogoutContext context) {
        priorityThread.setPriority(Thread.NORM_PRIORITY);
        if(context.getStatus() == true){
            logger.info("User: " + context.getUser() + " authenticated at: " + context.getDate() + " ;Log-in Status: " + context.getStatus() + " ;Priority Level: " +
                    priorityThread.getPriority());
        }
        else {
            logger.info("User: " + context.getUser() + " attempted to log-in at: " + context.getDate() + " ;Log-in Status:" + context.getStatus() + " ;Priority Level: " +
                    priorityThread.getPriority());
        }
    }

    @Override
    public void preMarshallReply(AuthenticationAndLogoutContext context) {
        priorityThread.setPriority(7);
        logger.info("User log-out initiated  ;Log-out Status: " + context.getStatus() + " ;Priority Level: " +
                priorityThread.getPriority());
    }

    @Override
    public void postMarshallReply(AuthenticationAndLogoutContext context) {
        priorityThread.setPriority(Thread.MAX_PRIORITY);
        logger.info("User: " + context.getUser() + " Logged-out at: " + context.getDate() + " ;Log-in status: " + context.getStatus() + " ;Priority Level: " +
                priorityThread.getPriority());
    }
}
