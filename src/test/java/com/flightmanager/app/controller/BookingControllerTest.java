package com.flightmanager.app.controller;

import com.flightmanager.app.delegate.CardDelegate;
import com.flightmanager.app.model.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingControllerTest {
    @Test
    void processPaymentTest() {
        Card card = new Card();
        card.setCardNumber("4564456445644564");
        card.setCsv("123");
        card.setExpDate("10/2020");

        card.setAuth(new CardDelegate(card));
    }
}