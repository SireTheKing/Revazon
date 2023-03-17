package com.revature.revazon.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name= "address")
@Component
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int addressId;
    @Column(nullable = false)
    private String street;
    private String unitNumber;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String State;
    @Column(nullable = false)
    private int zipCode;

    public Address(int addressId, String street, String unitNumber, String city, String state, int zipCode) {
        this.addressId = addressId;
        this.street = street;
        this.unitNumber = unitNumber;
        this.city = city;
        State = state;
        this.zipCode = zipCode;
    }

    public Address(String street, String unitNumber, String city, String state, int zipCode) {
        this.street = street;
        this.unitNumber = unitNumber;
        this.city = city;
        State = state;
        this.zipCode = zipCode;
    }

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", unitNumber='" + unitNumber + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
