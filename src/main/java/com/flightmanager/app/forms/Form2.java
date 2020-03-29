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
    private String addressPostCode;

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
                                 addressPostCode);

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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressPostCode() {
        return addressPostCode;
    }

    public void setAddressPostCode(String addressPostCode) {
        this.addressPostCode = addressPostCode;
    }
}
