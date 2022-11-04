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

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id")
    Film film;

    //Constructor
    public Inventory() { /*Empty as it has no non-ID columns */ }

    //Methods
    public int getInventoryId(){ return inventoryId; }
    public void setInventoryId(int myId) { inventoryId = myId; } }