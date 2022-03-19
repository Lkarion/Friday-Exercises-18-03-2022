package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Create two classes: Address with the fields street and houseNumber, constructor etc and Person with fields
        // name and address, constructor, getters etc. Create the third class AddressGetter which accepts an array
        // of persons and returns an array
        //of their addresses
        Address a1 = new Address("Asdf", 12);
        Person p1 = new Person("Ivan Ivanov", a1);
        Address a2 = new Address("Qwerttwe", 234);
        Person p2 = new Person("Petr Petrov", a2);
        Address a3 = new Address("Yxcvgbc", 54);
        Person p3 = new Person("Sidor Sidorov", a3);

        Person[] persons = {p1,p2,p3};
        System.out.println(Arrays.toString(AddressGetter.getAddressArray(persons)));
    }
}
