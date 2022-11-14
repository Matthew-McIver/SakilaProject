package com.Sakila.api.sakila.microservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Customer testCustomer = new Customer();

    Customer newCustomer = new Customer("Matthew", "McIver", "matthewpetermciver@gmail.com");

    @Test
    public void testCustomerId(){
        testCustomer.setCustomerId(1);
        Assertions.assertEquals(1, testCustomer.getCustomerId(), "Setter and/or getter for customer IDs is incorrect.");
    }

    @Test
    public void setTestCustomerFirstName(){
        testCustomer.setFirstName("Matthew");
        Assertions.assertEquals("Matthew", testCustomer.getFirstName(), "Setter and/or getter for customer first names is incorrect.");
    }

    @Test
    public void setTestCustomerLastName(){
        testCustomer.setLastName("McIver");
        Assertions.assertEquals("McIver", testCustomer.getLastName(), "Setter and/or getter for customer last names is incorrect.");
    }

    @Test
    public void setTestCustomerEmail(){
        testCustomer.setEmail("matthewpetermciver@gmail.com");
        Assertions.assertEquals("matthewpetermciver@gmail.com", testCustomer.getEmail(), "Setter and/or getter for customer emails is incorrect.");
    }
}
