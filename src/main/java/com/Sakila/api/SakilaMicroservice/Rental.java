package com.Sakila.api.SakilaMicroservice;

import javax.persistence.*;

@Entity
@Table(name = "rental")
public class Rental {
    //Attributes
    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentalId;

    @Column(name = "rental_date")
    int rentalDate;

    //Constructor
    public Rental(int myRentalDate)
    {
        this.rentalDate = myRentalDate;
    }

    public Rental()
    {

    }

    //Methods

    public int getRentalId() { return rentalId; }

    public void setRentalId(int myId) { rentalId = myId; }

    public int getRentalDate() { return rentalDate; }

    public void setRentalDate(int myRentalDate) { rentalDate = myRentalDate; }

}
