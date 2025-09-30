package basics;

public class OperatorsTest {

	public static void main(String[] args) {

		arithmeticOperationTest();

		unaryOperatorsTest();
		//assignment operators testº
		assignmentOperatorsTest();
	}

	private static void assignmentOperatorsTest() {
		int number1 =3;
		int number2 =20;
		float result = number1 + number2;
		System.out.println(result);
		result += number1;// result = result + number1
		System.out.println(result);
		result /= number1;// result = result / number1
		System.out.println(result);
		result *= number1;// result = result * number1
		System.out.println(result);
		result %= number1;// result = result % number1
		System.out.println(result);
	}

	private static void unaryOperatorsTest() {
		/**
		 * Unary Plus (Positive Value) + 
		 * Unary Minus (negation) - 
		 * Increment (Pre/Post)
		 * Decrement (Pre/Post) 
		 * Logical NOT 
		 * Bitwise complement
		 */

		int num1 = -234;
		num1++; // increment
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		
		System.out.println(num1++);
		num1 = num1 +1;
		System.out.println(num1);

	}

	private static void arithmeticOperationTest() {

		int num1 = 10, num2 = 10, num3 = 25;
		int result;
		result = num1 + num2;

		System.out.println(" The result of the operation is " + result);

		result = result - num3;

		System.out.println("The result is " + result);

		result = result * 2;
		System.out.println("The result is " + result);

		result = result / 2;
		System.out.println("The result is " + result);
		// 5%2 = 1
		result = result % 6;
		System.out.println("the module result is " + result);

	}

}
