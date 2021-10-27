package com.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Address Book Program");
		
		AddressBook.newContact(0);
		System.out.println(AddressBook.contacts[0]);

	}

}