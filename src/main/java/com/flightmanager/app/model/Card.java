package com.flightmanager.app.model;


import com.flightmanager.app.delegate.CardAuth;
import com.flightmanager.app.delegate.CardAuthImpl;

public class Card implements CardAuth {
    private String cardNumber;
    private String expDate;
    private String csv;
    private CardAuth auth;


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

    public void setAuth(CardAuth auth) {
        this.auth = auth;
    }

    @Override
    public boolean validate(){
//        CardAuthImpl auth = new CardAuthImpl(this);
        return auth.validate();
    }

}
