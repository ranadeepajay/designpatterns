package org.example.Structured.Adopter;

import org.example.Structured.Adopter.PaymentAPIs.SwiggyPaymentAPI;

public class SwiggyAdopter implements PaymentProcess{


    SwiggyPaymentAPI swiggyPaymentAPI;

    public SwiggyAdopter(SwiggyPaymentAPI swiggyPaymentAPI) {
        this.swiggyPaymentAPI = swiggyPaymentAPI;
    }

    @Override
    public void makeLink() {

        swiggyPaymentAPI.generateLink();
        
    }

    @Override
    public void pay() {

        swiggyPaymentAPI.pay();

    }

    @Override
    public void CheckStatus() {

        swiggyPaymentAPI.status();

    }
}
