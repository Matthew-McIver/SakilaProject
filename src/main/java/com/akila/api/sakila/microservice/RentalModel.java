package com.akila.api.sakila.microservice;

public class RentalModel {
    private int rentalDate;

    public RentalModel(int rDate){
        this.rentalDate = rDate;
    }

    public int getRentalDate(){ return rentalDate; }
}