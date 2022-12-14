package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {
    Customer testCustomer = new Customer();

    Customer newCustomer = new Customer("Matthew", "McIver", "matthewpetermciver@gmail.com", 1, new Address());

    @Test
    void testCustomerId(){
        testCustomer.setCustomerId(1);
        Assertions.assertEquals(1, testCustomer.getCustomerId(), "Setter and/or getter for customer IDs is incorrect.");
    }

    @Test
    void setTestCustomerFirstName(){
        testCustomer.setFirstName("Matthew");
        Assertions.assertEquals("Matthew", testCustomer.getFirstName(), "Setter and/or getter for customer first names is incorrect.");
    }

    @Test
    void setTestCustomerLastName(){
        testCustomer.setLastName("McIver");
        Assertions.assertEquals("McIver", testCustomer.getLastName(), "Setter and/or getter for customer last names is incorrect.");
    }

    @Test
    void setTestCustomerEmail(){
        testCustomer.setEmail("matthewpetermciver@gmail.com");
        Assertions.assertEquals("matthewpetermciver@gmail.com", testCustomer.getEmail(), "Setter and/or getter for customer emails is incorrect.");
    }

//    @Test
//    void setTestCustomerAddress(){
//        testCustomer.setAddress(new Address("1st street", "New York", 12345, "12345"));
//        Assertions.assertEquals(new Address("1st street", "New York", 12345, "12345"), testCustomer.getAddress(), "Setter and/or getter for customer address is incorrect.");
//    }
}
