package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerModelTest {
    CustomerModel testCustomer = new CustomerModel("Matthew", "McIver", "MatthewMcIver@gmail.com", 1, "1","1", "1", 2);
    @Test
    void testCustomerFirstName(){
        Assertions.assertEquals("Matthew", testCustomer.getFirstName(), "Getter for customer first name is incorrect."); }
    @Test
    void testCustomerLastName(){
        Assertions.assertEquals("McIver", testCustomer.getLastName(), "Getter for customer last name is incorrect."); }
    @Test
    void testCustomerEmail(){
        Assertions.assertEquals("MatthewMcIver@gmail.com", testCustomer.getEmailAddress(), "Getter for customer email is incorrect."); }
}
