package sakila.api;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RentalTest {

    Rental testRental = new Rental();

    Rental newRental = new Rental(2022);

    @Test
    void testRentalId(){
        testRental.setRentalId(1);
        Assertions.assertEquals(1, testRental.getRentalId(), "Setter and/or getter for rental IDs is incorrect.");
    }

    @Test
    void testRentalDate(){
        testRental.setRentalDate(2022);
        Assertions.assertEquals(2022, testRental.getRentalDate(), "Setter and/or getter for rental dates is incorrect.");
    }
}
