package com.Sakila.api.SakilaMicroservice;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    Inventory testInventory = new Inventory();

    @Test
    public void testInventoryId(){
        testInventory.setInventoryId(1);
        Assertions.assertEquals(1, testInventory.getInventoryId(), "Setters and/or getters for inventory IDs are incorrect.");
    }

}
