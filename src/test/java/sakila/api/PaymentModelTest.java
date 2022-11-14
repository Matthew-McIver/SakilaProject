package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentModelTest {
    PaymentModel testPayment = new PaymentModel(1.99);
    @Test
    void testPaymentAmount(){
        Assertions.assertEquals(1.99, testPayment.getPaymentAmount(), "Getter for payment amount is incorrect."); } }