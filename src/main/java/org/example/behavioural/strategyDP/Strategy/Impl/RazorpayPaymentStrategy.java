package org.example.behavioural.strategyDP.Strategy.Impl;

import org.example.behavioural.strategyDP.Strategy.PaymentStrategy;

public class RazorpayPaymentStrategy implements PaymentStrategy {
    private String emailId;

    public RazorpayPaymentStrategy(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {

        System.out.println(amount+" is paid by using razorpay with emailId :"+emailId);

    }
}
