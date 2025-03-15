package org.example.behavioural.strategyDP;

import org.example.behavioural.strategyDP.Strategy.Impl.CreditCardPaymentStrategy;
import org.example.behavioural.strategyDP.Strategy.Impl.RazorpayPaymentStrategy;
import org.example.behavioural.strategyDP.Strategy.Impl.UpiPaymentStrategy;
import org.example.behavioural.strategyDP.Strategy.PaymentStrategy;
import org.example.behavioural.strategyDP.context.PaymentContext;

public class ClientMain {
    public static void main(String[] args) {

        PaymentStrategy paymentStrategy=new CreditCardPaymentStrategy("card124");

        PaymentContext payment=new PaymentContext(paymentStrategy);
        payment.pay(1300);


        paymentStrategy=new RazorpayPaymentStrategy("ranadeepajay@gmail.com");
        payment=new PaymentContext(paymentStrategy);
        payment.pay(1500);


        paymentStrategy=new UpiPaymentStrategy("ranadeep@ybl");
        payment=new PaymentContext(paymentStrategy);

        payment.pay(1500);
    }
}
