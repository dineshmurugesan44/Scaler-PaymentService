package com.scaler.paymentservicebeginner.services;

import org.springframework.stereotype.Service;


public interface IPaymentService {

    String initiatePayment(String email,String name,String phoneNumber,String orderId, Long amount);
}
