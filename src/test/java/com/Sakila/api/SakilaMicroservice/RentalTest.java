package com.Sakila.api.SakilaMicroservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalTest {

    Rental testRental = new Rental();

    Rental newRental = new Rental(2005);

    @Test
    public void testRentalId(){
        testRental.setRentalId(1);
        Assertions.assertEquals(1, testRental.getRentalId(), "Setter and/or getter for rental IDs is incorrect.");
    }

    @Test
    public void testRentalDate(){
        testRental.setRentalDate(2001);
        Assertions.assertEquals(2001, testRental.getRentalDate(), "Setter and/or getter for rental dates is incorrect.");
    }
}
