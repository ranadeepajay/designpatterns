package org.example.Structured.Adopter;


import org.example.Structured.Adopter.PaymentAPIs.RazorpayPaymentAPI;

public class RazorpayAdopter implements PaymentProcess{
    RazorpayPaymentAPI razorpayPaymentAPI;

    public RazorpayAdopter(RazorpayPaymentAPI razorpayPaymentAPI) {
        this.razorpayPaymentAPI = razorpayPaymentAPI;
    }

    @Override
    public void makeLink() {

        razorpayPaymentAPI.makeLink();

    }

    @Override
    public void pay() {
        razorpayPaymentAPI.makepay();

    }

    @Override
    public void CheckStatus() {

        razorpayPaymentAPI.checkstatus();

    }
}
