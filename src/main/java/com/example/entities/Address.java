package com.example.entities;

import jakarta.persistence.Entity;

public class Address
{
    private String street;
    private String city;
    private int zipCode;
    private String country;

    // Constructor:
    Address(String street, String city, int zipCode, String country)
    {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    Address() {}

    //GetterMethod:
    private String getStreet()
    {
        return this.street;
    }
    private String getCity()
    {
        return this.city;
    }
    private int getZipCode()
    {
        return this.zipCode;
    }
    private String getCountry()
    {
        return this.country;
    }

    // to-String method:

    @Override
    public String toString() {
        return super.toString();
    }
}
