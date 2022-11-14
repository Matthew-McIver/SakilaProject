package com.akila.api.sakila.microservice;

public class ActorModel {
    private String firstName;
    private String lastName;

    public ActorModel(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
}
