package oopmodeling.addressbook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import datastructure.FlexibleArray;
import utils.FileUtil;


/**
 * This class is in charge of administrating a group of contacts
 * 
 * 
 * @author Justo 26 nov 2025
 */
public class AddressBook {

	// Atributes
	protected FlexibleArray<Contact> contacts;

	public AddressBook() {
		contacts = new FlexibleArray<Contact>();
	}
	
	
	
	protected Scanner scanner;

	// Behaves
	public void showContacts() {
	for (int i = 0; i < contacts.size(); i++) {
		System.out.println(contacts.get(i).toString());
		
	}

	}

	
	public void addContact(Contact contact) {
		contacts.add(contact);
		
		FileUtil.wrtiteToFile(contact);

	}
	
	

	public boolean removeContact(String name) {
		// 1 a loop to find the position of the contact in the array
		Contact[] eles = contacts.getAll();
		for (int i = 0; i < eles.length; i++) {
			if (contacts.get(i).getName().equals(name)) {
				contacts.remove(i);
				return true;
			}

		}

		// 2 remove contacts from its position in the array
		contacts.remove(0);

		return false;

	}
}
