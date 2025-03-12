package org.example.Structured;

import org.example.Structured.Adopter.PaymentAPIs.SwiggyPaymentAPI;
import org.example.Structured.Adopter.PaymentProcess;
import org.example.Structured.Adopter.SwiggyAdopter;

public class Main {

    public static void main(String[] args) {

        PaymentProcess swiggyPayment=new SwiggyAdopter(new SwiggyPaymentAPI());
        swiggyPayment.CheckStatus();
        swiggyPayment.pay();
        swiggyPayment.makeLink();

    }
}
