package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InventoryTest {
    Inventory testInventory = new Inventory();

    @Test
    void testInventoryId(){
        testInventory.setInventoryId(1);
        Assertions.assertEquals(1, testInventory.getInventoryId(), "Setters and/or getters for inventory IDs are incorrect.");
    }

}
