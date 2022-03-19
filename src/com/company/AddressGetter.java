package com.company;

public class AddressGetter {
    //Create the third class AddressGetter which accepts an array
    //of persons and returns an array of their addresses
    Person[] persons;

    public AddressGetter(Person[] persons) {
        this.persons = persons;
    }
    public static Address[] getAddressArray(Person[] persons){
        Address[] addresses = new Address[persons.length];
        for (int i = 0; i < persons.length; i++) {
            addresses[i] = persons[i].getAddress();
        }
        return addresses;
    }
}
