package com.Sakila.api.SakilaMicroservice;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "inventory")
public class Inventory {
    //Attributes
    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventoryId;

    @ManyToOne
    @MapsId("rentalId")
    @JoinColumn(name = "rental_id")
    Rental rental;

    @OneToMany(mappedBy = "inventory")
    Set<Film> films;

    //Constructor
    public Inventory()
    {

    }

    //Methods
    public int getInventoryId(){ return inventoryId; }
    public void setInventoryId(int myId) { inventoryId = myId; }
}
