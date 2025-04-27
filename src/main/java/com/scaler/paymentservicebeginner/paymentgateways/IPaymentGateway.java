package com.scaler.paymentservicebeginner.paymentgateways;

public interface IPaymentGateway {

    String getPaymentLink(String email, String name, String phoneNumber, String orderId, Long amount);

}


