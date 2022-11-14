package com.akila.api.sakila.microservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerModelTest {
    CustomerModel testCustomer = new CustomerModel("Matthew", "McIver", "MatthewMcIver@gmail.com");
    @Test
    public void testCustomerFirstName(){
        Assertions.assertEquals("Matthew", testCustomer.getFirstName(), "Getter for customer first name is incorrect."); }
    @Test
    public void testCustomerLastName(){
        Assertions.assertEquals("McIver", testCustomer.getLastName(), "Getter for customer last name is incorrect."); }
    @Test
    public void testCustomerEmail(){
        Assertions.assertEquals("MatthewMcIver@gmail.com", testCustomer.getEmailAddress(), "Getter for customer email is incorrect."); }
}
