package com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String phoneNumber;

    AddressBook(String firstName, String lastName, String address, String city, String state, int zipCode,
                String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressBookMain [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook("Amol", "Nagose", "Donad", "Bhandara", "Maharastra", 441803,
                "8788393819");
        System.out.println(addressBook);
    }
}