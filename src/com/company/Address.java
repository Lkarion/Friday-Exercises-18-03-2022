package com.company;

public class Address {
    // Create two classes: Address with the fields street and houseNumber, constructor etc and Person with fields
    // name and address, constructor, getters etc.
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return String.format("Address: %s, %s",street,houseNumber);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
