package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressModelTest {
    AddressModel testAddress = new AddressModel("123 1st Street", "New York", 12345, "12345");
    @Test
    void testAddressTitle(){
        Assertions.assertEquals("123 1st Street", testAddress.getAddressTitle(), "Getter for address title is incorrect."); }
    @Test
    void testAddressDistrict(){
        Assertions.assertEquals("New York", testAddress.getDistrictTitle(), "Getter for address district is incorrect."); }
    @Test
    void testAddressPostCode(){
        Assertions.assertEquals(12345, testAddress.getPostalCode(), "Getter for address postal code is incorrect."); } }