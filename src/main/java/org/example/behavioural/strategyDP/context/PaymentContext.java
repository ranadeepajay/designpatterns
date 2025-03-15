package org.example.behavioural.strategyDP.context;

import org.example.behavioural.strategyDP.Strategy.PaymentStrategy;

public class PaymentContext {
    private  PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public  void pay(int amount){
        paymentStrategy.pay(amount);
    }
}
