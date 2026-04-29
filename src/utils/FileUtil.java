package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import oopmodeling.addressbook.Contact;

public class FileUtil {
	public static void writeToFile(Contact contact) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("contacts.txt"));){
			writer.write(contact.getName() + ";" + contact.getEmail());
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToFile(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
