package com.flightmanager.app.serviceImpl;

import com.flightmanager.app.service.StripeService;
import com.flightmanager.app.utils.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StripeServiceImpl implements StripeService {

    @Value("${SECRET_KEY_STRIPE}")
    private String API_SECRET_KEY;

    @PostConstruct
    public void init() {
        Stripe.apiKey = API_SECRET_KEY;
    }

    @Override
    public Charge createCharge(ChargeRequest request){
        Charge charge = new Charge();
        try{
            Stripe.apiKey = API_SECRET_KEY;
            Map<String, Object> chargeParams = new HashMap<>();
            chargeParams.put("amount", request.getAmount());
            chargeParams.put("currency", request.getCurrency());
            chargeParams.put("description", request.getDescription());
            chargeParams.put("source", request.getStripeToken());

            charge = Charge.create(chargeParams);
        }catch (Exception e){
            e.printStackTrace();
        }

        return charge;
    }
}
