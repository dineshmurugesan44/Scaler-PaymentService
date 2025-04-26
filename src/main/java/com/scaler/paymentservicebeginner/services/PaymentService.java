package com.scaler.paymentservicebeginner.services;

import com.scaler.paymentservicebeginner.paymentgateways.RazorpayPaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PaymentService implements IPaymentService {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Override

    public String initiatePayment(String email,String name,String phoneNumber,String orderId, Long amount) {
        return razorpayPaymentGateway.getPaymentLink(email, name, phoneNumber, orderId, amount);
    }
}
