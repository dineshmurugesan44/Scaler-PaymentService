package com.scaler.paymentservicebeginner.controllers;


import com.scaler.paymentservicebeginner.dtos.PaymentDto;
import com.scaler.paymentservicebeginner.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/payment")
public class PaymentController {


    @Autowired
    private IPaymentService paymentService;


    @PostMapping
    public String intiatePayment(@RequestBody PaymentDto paymentDto) {
        return paymentService.initiatePayment(paymentDto.getEmail(),paymentDto.getName(),paymentDto.getPhoneNumber(),
        paymentDto.getOrderId(),paymentDto.getAmount());

    }


}
