package com.flightmanager.app.forms;

import com.flightmanager.app.model.BookingData;
import org.springframework.beans.factory.annotation.Autowired;

public class Form2 implements FormHandler{
    private int userID;
    private String userEmail;
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressCountry;
    private String addressPostcode;

    @Autowired
    private FormHandler nextForm;

    @Override
    public void nextInChain(FormHandler handler) {
        this.nextForm = handler;
    }

    @Override
    public boolean process(BookingData bookingData) {
        bookingData.setUserID(userID);
        bookingData.setUserEmail(userEmail);
        bookingData.setAddress(addressLine1 + "," + addressLine2 + "," +
                                addressCity + "," + addressCountry + "," +
                                 addressPostcode);

        return nextForm == null || nextForm.process(bookingData);
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setAddressPostCode(String addressPostCode) {
        this.addressPostCode = addressPostCode;
    }
}
