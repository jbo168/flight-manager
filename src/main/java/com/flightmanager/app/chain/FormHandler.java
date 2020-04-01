package com.flightmanager.app.chain;

import com.flightmanager.app.model.BookingData;
import org.springframework.stereotype.Component;

@Component
public interface FormHandler {
    void nextInChain(FormHandler handler);
    boolean process(BookingData bookingData);
}
