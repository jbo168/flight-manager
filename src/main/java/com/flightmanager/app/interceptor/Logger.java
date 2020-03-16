package com.flightmanager.app.interceptor;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;

@Component
public class Logger {

    public Logger(){}

    org.slf4j.Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    public void logEvent(String log){
        logger.info("Logged:" + log);
    }
}
