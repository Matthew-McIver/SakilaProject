package com.Sakila.api.SakilaMicroservice;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {
    //Attributes
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addressId;

    @OneToMany(mappedBy = "address")
    Set<Customer> customer;

    @Column(name = "address")
    String addressTitle;

    @Column(name = "district")
    String districtTitle;

    @Column(name = "postal_code")
    int postalCode;

    //Constructor
    public Address(String myAddress, String myDistrict, int myPostalCode)
    {
        this.addressTitle = myAddress;
        this.districtTitle = myDistrict;
        this.postalCode = myPostalCode;
    }

    public Address()
    {

    }

    //Methods
    public int getAddressId() { return addressId; }
    public void setAddressId(int myId) { addressId = myId; }

    public String getAddressTitle() { return addressTitle; }
    public void setAddressTitle(String myAddressTitle) { addressTitle = myAddressTitle; }

    public String getDistrictTitle() { return districtTitle; }
    public void setDistrictTitle(String myDistrictTitle) { districtTitle = myDistrictTitle; }

    public int getPostalCode() { return postalCode; }
    public void setPostalCode(int myPostCode) { postalCode = myPostCode; }
}
