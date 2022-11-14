package sakila.api;

public class RentalModel {
    private int rentalDate;

    public RentalModel(int rDate){
        this.rentalDate = rDate;
    }

    public int getRentalDate(){ return rentalDate; }
}