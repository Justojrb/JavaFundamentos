package javacontrols;

public class IfControl {
	public static void main(String[] arg) {
		
		int num1;
		int num2;
		num1 = 95;
		num2 = 34;
		int result;
		result = num1 - num2;
		System.out.println(result);
		/**
		 * The number stored in "result"
		 */
		if(result > 0) {
			System.out.println("number 1 is grater than number 2");
	}
		else if (result == 0) {
			//
			System.out.println("number 1 is less than number 2");
		} 
	}

}
