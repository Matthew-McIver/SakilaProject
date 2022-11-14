package com.akila.api.sakila.microservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    Payment testPayment = new Payment();
    Payment newPayment = new Payment(2.99);
    @Test
    public void testPaymentId(){
        testPayment.setPaymentId(1);
        Assertions.assertEquals(1, testPayment.getPaymentId(), "Setters and/or getters for payment IDs are incorrect."); }
    @Test
    public void testAmount(){
        testPayment.setAmount(1.99);
        Assertions.assertEquals(1.99, testPayment.getAmount(), "Setters and/or getters for payment amount are incorrect.");} }