package com.flightmanager.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PaymentController {
//
//    @Value("${PUBLIC_KEY_STRIPE}")
//    private String apiKey;
//    @Autowired
//    private StripeService service;
//    @Autowired
//    private FlightService flightService;
//
//    @GetMapping("/pay")
//    public String pay(Model model){
//
//        int flightCost = flightService.findById(2).get().getCost();
//        int serviceCharge = flightService.findById(2).get().accept(new ServiceVisitor());
//        model.addAttribute("flightCost", flightCost);
//        model.addAttribute("serviceCharge", serviceCharge);
//        model.addAttribute("total", flightCost + serviceCharge);
//        model.addAttribute("card", new Card());
//
//        return "noStripe";
//    }
//
//    @PostMapping("/processPayment")
//    public String processPayment(Card card){
//        if (!card.validate()) return "noStripe";
//
//        return "redirect:/userFlights";
//    }

    //Stripe
//    @RequestMapping("/checkout")
//    public String checkout(Model model){
//
////        int amount = flightService.findById(2).get().accept(new ServiceVisitor());
//        model.addAttribute("amount", 13530); //135.3 in cents
//        model.addAttribute("stripePublicKey", apiKey);
//        model.addAttribute("currency", ChargeRequest.Currency.EUR);
//
//        return "testPayment";
//    }
//
//    @PostMapping("/charge")
//    public String charge(ChargeRequest request, Model model) {
//
//            request.setDescription("Test");
//            request.setCurrency(ChargeRequest.Currency.EUR);
//            Charge charge = service.createCharge(request);
//            model.addAttribute("id", charge.getId());
//            model.addAttribute("status", charge.getStatus());
//            model.addAttribute("chargeId", charge.getId());
//            model.addAttribute("balance_transaction", charge.getBalanceTransaction());
//
//        return "testPayResult";
//    }
}
