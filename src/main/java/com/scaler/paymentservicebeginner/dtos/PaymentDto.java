package com.scaler.paymentservicebeginner.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PaymentDto {
    String email;
    String name;
    String phoneNumber;
    String orderId;
    Long amount;
}
