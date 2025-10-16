package basics;

import java.util.Arrays;

public class GenericMethods {

	public static void main(String[] args) {

		String[] names = { "Pablo", "Juan", "Ana", "Justo", "Ruben" };
		int[] scores = { 12666, 1000, 3423, 34, 2, 20, 3, 2 };
		SwitchValues(names, 0, 1);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));
	}

	public static <Element> void SwitchValues(Element[] Values, int index1, int index2) {
		
		if (Values == null) {
			return;
		}

		// "||" this operator "or" used to add multiple conditions
		// if one of the conditions is true, the statements inside the if body
		// will be executed
		if (index1 < 0 || index2 < 0) {
			return;
		}

		Element temp = Values[index1];
		Values[index1] = Values[index2];
		Values[index2] = temp;

	}
}
