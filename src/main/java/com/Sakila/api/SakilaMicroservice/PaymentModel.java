package com.Sakila.api.SakilaMicroservice;

public class PaymentModel {
    private int paymentAmount;

    public PaymentModel(int pAmount){
        this.paymentAmount = pAmount;
    }

    public int getPaymentAmount(){ return paymentAmount; }
}