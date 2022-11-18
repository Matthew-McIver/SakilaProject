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
    @Test
    void testCustomerAddressId(){
        Assertions.assertEquals(1, testCustomer.getAddressId(), "Getter for customer address ID is incorrect.");
    }
    @Test
    void testCustomerAddressTitle(){
        Assertions.assertEquals("1", testCustomer.getAddressTitle(), "Getter for customer address title is incorrect.");
    }
    @Test
    void testCustomerAddressDistrict(){
        Assertions.assertEquals("1", testCustomer.getDistrictTitle(), "Getter for customer address district is incorrect.");
    }
    @Test
    void testCustomerAddressPhoneNumber(){
        Assertions.assertEquals("1", testCustomer.getPhoneNumber(), "Getter for customer phone number is incorrect.");
    }
    @Test
    void testCustomerAddressPostalCode(){
        Assertions.assertEquals(2, testCustomer.getPostalCode(), "Getter for customer address postal code is incorrect.");
    }
}
