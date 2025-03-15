package org.example.behavioural.strategyDP.Strategy.Impl;

import org.example.Structured.Adopter.PaymentProcess;
import org.example.behavioural.strategyDP.Strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private  String CreditCardNo;

    public CreditCardPaymentStrategy(String creditCardNo) {
        CreditCardNo = creditCardNo;
    }

    public String getCreditCardNo() {
        return CreditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        CreditCardNo = creditCardNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by using credit card with no"+this.CreditCardNo);
    }
}
