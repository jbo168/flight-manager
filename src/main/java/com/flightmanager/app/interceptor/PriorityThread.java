package com.flightmanager.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: Darius Gaurilka
 **/

@Component
public class PriorityThread extends Thread{

    Logger logger = LoggerFactory.getLogger(PriorityThread.class);

    public void run(){
        logger.info("Interception Priority Thread is running...");
    }
}
