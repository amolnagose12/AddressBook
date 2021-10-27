package com.addressbook;

import java.util.Scanner;

public class AddressBook {

static AddressBook contacts[] = new AddressBook[2];
	
	static String firstName;
	static String lastName;	
	static String fullAddress;
	static long zip;
	static long phoneNumber;
	static String email;
	
	public AddressBook() {
		 
		Scanner input = new Scanner(System.in);
		//Taking input from user		//Read full Name
		System.out.println("Enter first Name:"); 
		firstName = input.nextLine();
		
		System.out.println("Enter last Name:"); 
		lastName = input.nextLine();
		
		//Address input
		System.out.println("Enter full Address with city & state:"); 
		fullAddress = input.nextLine();
		
		// Email input
		System.out.println("Enter Email:"); 
		email = input.nextLine();	
		
		//Zip Code input
		System.out.println("Enter Zip Code:"); 
		zip = input.nextLong();	
		
		//Phone Number input
		System.out.println("Enter Phone Number:"); 
		phoneNumber = input.nextLong();
		input.close();	  
		}
	
	//method to create new contact
	public static void newContact(int index) {
		if(index < contacts.length) {
		contacts[index] = new AddressBook();
		}
		else {
			System.out.println("Contact List is Full");
		}
		return ;
	}
	
		@Override
	public String toString() {
		return "AddingContact [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getFullAddress()=" + getFullAddress() + ", getZip()=" + getZip() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getEmail()=" + getEmail() + "]";
	}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFullAddress() {
			return fullAddress;
		}

		public void setFullAddress(String fullAddress) {
			this.fullAddress = fullAddress;
		}

		public long getZip() {
			return zip;
		}

		public void setZip(long zip) {
			this.zip = zip;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	
}