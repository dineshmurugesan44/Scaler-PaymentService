package com.scaler.paymentservicebeginner.configuration;


import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {

    //IN ORDER TO READ ANY VALUE FROM APPLICATION  PROPERTY USE VALUE ANNOTATION
    @Value("${razorpay.id}")
    private String razorpayId;

    @Value("${razorpay.secret}")
    private String razorpaySecret;

    @Bean
    public RazorpayClient razorpayClient() {

        try {
            return new RazorpayClient(razorpayId, razorpaySecret);
        }catch (RazorpayException exception){
            throw new RuntimeException(exception.getMessage());
        }

    }
}



