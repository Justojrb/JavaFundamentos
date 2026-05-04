package oopmodeling.addressbook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * This class is in charge of administration of 
 * a group of contacts.
 * 
 * @author mpeng
 * @author Manolo
 * Nov 26, 2025
 */

import datastructure.FlexibleArray;
import utils.FileUtil;
/**
 * This class is used to manage a list of contact objects
 * @author mpeng
 * @author Manolo
 * Nov 28, 2025
 */
public class AddressBook {

	// Attributes
	//This is the container for the list of contact objects
	protected FlexibleArray<Contact> contacts;
	
	public AddressBook() {
		contacts = new FlexibleArray<Contact>();
	}
	// behaves
	public void showContacts() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i).toString());
		}
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
		
		FileUtil.writeToFile(contact.getName() + ";" + contact.getEmail(), "contacts.txt");
		
		Contact contact2 = new Contact("Manolo", "123456789", "");
		
	}
	
	private static void manipulateObject(Contact contact) {
		Class<?> cls = contact.getClass();
		Field[] fields = cls.getDeclaredFields();
		try {
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println("Field name: " + field.getName() + ", value: " + field.get(contact));
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	
	
	public boolean removeContact(String name) {
		//1 a loop to find the position of the contact in the array
		//Contact[] eles = contacts.getAll();
		for (int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).getName().equals(name)) {
				contacts.remove(i);
				return true;
			}
		}
		//2 remove the contact by its position in the array
		
		
		return false;
	}
	public char[] getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
