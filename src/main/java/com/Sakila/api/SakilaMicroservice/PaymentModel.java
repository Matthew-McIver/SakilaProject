package com.Sakila.api.SakilaMicroservice;

public class PaymentModel {
    private double paymentAmount;

    public PaymentModel(double pAmount){
        this.paymentAmount = pAmount;
    }

    public double getPaymentAmount(){ return paymentAmount; }
}