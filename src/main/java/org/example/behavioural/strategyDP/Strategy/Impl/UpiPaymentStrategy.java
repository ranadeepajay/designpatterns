package org.example.behavioural.strategyDP.Strategy.Impl;

import org.example.behavioural.strategyDP.Strategy.PaymentStrategy;

public class UpiPaymentStrategy implements PaymentStrategy {
    private  String  upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {

        System.out.println(amount+" is paid using upi payment method with upiid:"+this.upiId);


    }


}
