package com.flightmanager.app.delegate;

import com.flightmanager.app.model.Card;

import java.util.Calendar;


public class CardAuthImpl implements CardAuth{
    private Card card;

    public CardAuthImpl(Card card){
        this.card = card;
    }

    @Override
    public boolean validate(){
        if(!validateCardNum()) return false;
        else if(!validateDate()) return false;
        else if(!validateCSV()) return false;
        else return true;
    }

    private boolean validateCardNum() {
        String pattern = "[0-9]{4}(\\s?[0-9]{4}){3}";
        if(card.getCardNumber().matches(pattern)) return true;
        else return false;
    }

    private boolean validateDate() {
        String pattern = "[0-9]{2}/[0-9]{4}";
        if(!card.getExpDate().matches(pattern)) return false;

        String[] date = card.getExpDate().split("/");
        int month = Integer.parseInt(date[0]);
        int year = Integer.parseInt(date[1]);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);

        if(month<1 || month>12) return false;
        else if(year < currentYear || year-currentYear > 10) return false;
        else if(year == currentYear && month <= currentMonth) return false;

        return true;
    }

    private boolean validateCSV() {
        int csv = Integer.parseInt(card.getCsv());
        if(csv > 99 && csv < 1000) return true;
        else return false;
    }

}
