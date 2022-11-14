package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressTest {
    Address testAddress = new Address();

    Address newAddress = new Address("123 1st Street", "Liverpool", 12345);

    @Test
    void testAddressId(){
        testAddress.setAddressId(1);
        Assertions.assertEquals(1, testAddress.getAddressId(), "Setter and/or getter for address IDs is incorrect.");
    }

    @Test
    void testAddressTitle(){
        testAddress.setAddressTitle("123 1st Street");
        Assertions.assertEquals("123 1st Street", testAddress.getAddressTitle(), "Setter and/or getter for Address titles is incorrect.");
    }

    @Test
    void testDistrictTitle(){
        testAddress.setDistrictTitle("Liverpool");
        Assertions.assertEquals("Liverpool", testAddress.getDistrictTitle(), "Setter and/or getter for district titles is incorrect.");
    }

    @Test
    void testPostalCode(){
        testAddress.setPostalCode(12345);
        Assertions.assertEquals(12345, testAddress.getPostalCode(), "Getter and/or setter for postal codes is incorrect.");
    }
}

