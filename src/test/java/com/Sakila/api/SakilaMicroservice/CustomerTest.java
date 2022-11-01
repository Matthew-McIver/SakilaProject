package com.Sakila.api.SakilaMicroservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Customer testCustomer = new Customer();

    Customer newCustomer = new Customer("Sofia", "Katsou", "SofiaKatsou01@gmail.com");

    @Test
    public void testCustomerId(){
        testCustomer.setCustomerId(1);
        Assertions.assertEquals(1, testCustomer.getCustomerId(), "Setter and/or getter for customer IDs is incorrect.");
    }

    @Test
    public void setTestCustomerFirstName(){
        testCustomer.setFirstName("John");
        Assertions.assertEquals("John", testCustomer.getFirstName(), "Setter and/or getter for customer first names is incorrect.");
    }

    @Test
    public void setTestCustomerLastName(){
        testCustomer.setLastName("Smith");
        Assertions.assertEquals("Smith", testCustomer.getLastName(), "Setter and/or getter for customer last names is incorrect.");
    }

    @Test
    public void setTestCustomerEmail(){
        testCustomer.setEmail("JohnSmith@hotmail.com");
        Assertions.assertEquals("JohnSmith@hotmail.com", testCustomer.getEmail(), "Setter and/or getter for customer emails is incorrect.");
    }
}
