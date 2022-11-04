package com.Sakila.api.sakila.microservice;

public class CustomerModel {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public CustomerModel(String fName, String lname, String eAddress) {
        this.firstName = fName;
        this.lastName = lname;
        this.emailAddress = eAddress;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getEmailAddress(){ return emailAddress; }
}
