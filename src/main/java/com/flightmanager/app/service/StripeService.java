package com.flightmanager.app.service;

import com.flightmanager.app.utils.ChargeRequest;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Value;

public interface StripeService {

    Charge createCharge(ChargeRequest request);
}
