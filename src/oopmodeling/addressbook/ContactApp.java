package oopmodeling.addressbook;

import java.util.Scanner;

/**
 * 
 * @author Justo 26 nov 2025
 */
public class ContactApp {

	final static AddressBook addressbook = new AddressBook();
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		byte option = 4;

		while (true) {
			showMenu();

			option = scanner.nextByte();
			System.out.println(option);

			if (option == 4) {
				System.out.println("Exiting program");
				break;

			}

			else if (option == 1) {
				addContact();
			}
		}

	}

	// addressbook.showContacts();
	// addressbook.addContact(null);5

	private static void addContact() {
		System.out.println(" Create new contact number to your address book ");
		
		//1 the user introduces the phone number, name and other info about the contact
		
		System.out.println(" Please enter the contacts name ");
		String name = scanner.nextLine();
		//2 Create new object of "contact" encapsulating all the data passed in the first step
		
		//3 Add the new object to the contact array
		
	}


	private static void showMenu() {

		System.out.println("1, Create new contact");
		System.out.println("2, Show contact");
		System.out.println("3, remove contact");
		System.out.println("4, Exit");

	}

}
