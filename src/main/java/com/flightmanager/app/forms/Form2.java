package com.flightmanager.app.forms;

import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;

public class Form2 implements FormHandler{
    private int userID;
    private String userEmail;
    private String address;

    @Autowired
    private FormHandler nextForm;

    @Override
    public void nextInChain(FormHandler handler) {

    }

    @Override
    public boolean process(BookingData bookingData) {

        return nextForm == null || nextForm.process(bookingData);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
