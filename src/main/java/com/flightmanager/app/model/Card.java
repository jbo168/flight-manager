package com.flightmanager.app.model;


import com.flightmanager.app.delegate.CardAuth;

public class Card {
    private CardAuth auth = new CardAuth(this);
    private String cardNumber;
    private String expDate;
    private String csv;


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    public boolean validate(){
        return auth.validate();
    }

}
