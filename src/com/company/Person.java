package com.company;

public class Person {
    // Create two classes: Address with the fields street and houseNumber, constructor etc and Person with fields
    // name and address, constructor, getters etc.
    private String name;
    private Address address;
    static int counter;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
        counter++;
    }

    @Override
    public String toString() {
        return String.format("Person: %s, %s", name, address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
