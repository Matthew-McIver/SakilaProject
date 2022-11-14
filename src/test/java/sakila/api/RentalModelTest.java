package sakila.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentalModelTest {
    RentalModel testRental = new RentalModel(2022);
    @Test
    public void testRentalDate(){
        Assertions.assertEquals(2022, testRental.getRentalDate(), "Getter for rental date is incorrect."); }
}
