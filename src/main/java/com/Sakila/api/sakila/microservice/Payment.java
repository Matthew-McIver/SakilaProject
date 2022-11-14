package com.Sakila.api.sakila.microservice;
import javax.persistence.*;
@Entity
@Table(name = "payment")
public class Payment {
    //Attributes
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int paymentId;

    @OneToOne(mappedBy = "payment")
    private Rental rental;

    @Column(name = "amount")
    double amount;

    //Constructor
    public Payment(double myAmount) { this.amount = myAmount; }

    public Payment() {}

    //Methods
    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int myId) { paymentId = myId; }

    public double getAmount() { return amount; }
    public void setAmount(double myAmount) { amount = myAmount; } }