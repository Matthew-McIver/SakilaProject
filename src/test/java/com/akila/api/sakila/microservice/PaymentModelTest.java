package com.akila.api.sakila.microservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentModelTest {
    PaymentModel testPayment = new PaymentModel(1.99);
    @Test
    public void testPaymentAmount(){
        Assertions.assertEquals(1.99, testPayment.getPaymentAmount(), "Getter for payment amount is incorrect."); } }