package oopmodeling.addressbook;

import java.util.Scanner;

import datastructure.FlexibleArray;

/**
 * This class is in charge of administrating a group of contacts
  
 
 *@author Justo
 *26 nov 2025
 */
public class AddressBook {
	
	//Atributes
	protected FlexibleArray <Contact> contacts;
	
	protected Scanner scanner;

	//Behaves
	public void showContacts() {
		
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
		
	}
	
	public boolean removeContact(String name) {
		//1 a loop to find the position of the contact in the array	
		Contact[] eles = contacts.getAll();
		for (int i = 0; i < eles.length; i++) {
			Contact contact = eles[i];
			
		}
		
		
		//2 remove contacts from its position in the array
		contacts.remove(0);
		
		
		return false;
		
	}
}
