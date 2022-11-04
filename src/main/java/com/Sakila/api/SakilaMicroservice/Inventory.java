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

    @OneToMany(mappedBy = "inventory")
    Set<Rental> rental;

//    @OneToMany(mappedBy = "inventory")
//    private Set<Film> films;

    @OneToOne(mappedBy = "inventory")
    private Film film;

    //Constructor
    public Inventory() {}

    //Methods
    public int getInventoryId(){ return inventoryId; }
    public void setInventoryId(int myId) { inventoryId = myId; } }