package datastructure;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.random.RandomGenerator;

import oopmodeling.Planeta;

public class ArrayTest {

	public static void main(String[] args) {
		String[] names = { "Pablo", "Juan", };
		Planeta[] planets = { new Planeta(), new Planeta() };

		System.out.println(names[1]);

		int[] nums = new int[2000];
		initializeArray(nums);

		findMaxiMin(nums);

		sumup();

		int[] Values = { 12, 34, 200, 32 };

		SwitchValues(Values, 0, 3);
		System.out.println(Arrays.toString(Values));
		SwitchValues(Values, 2, 1);
		System.out.println(Arrays.toString(Values));
		SwitchValues(Values, 3, 2);
		System.out.println(Arrays.toString(Values));

		incrementsalary();

		int[] numbers = { 99, 2000, 1400, 100 };

		switchArray(numbers, 0, 3, 1, 2);
		System.out.println(Arrays.toString(numbers));

		int[] numeros1 = { 47, 50, 37, 85 };
		reverse(numeros1);
		System.out.println(Arrays.toString(numeros1));

		int[] sliced = slice(Values, 1, 3);
		System.out.println(Arrays.toString(sliced));

	}

	/**
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */

private static int[] slice(int[] arr, int start, int end) {
		
		if(arr == null) {
			return null;
		}
		
		if(start < 0 || end < 0 || start >= arr.length || end >= arr.length) {
			return null;
		}
		
		System.out.println(arr);
		int[] result = new int[end - start + 1];
		//result[0] = arr[start];
		//result[1] = arr[start + 1];
		//result[2] = arr[start + 2];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[start + i];
	}
		return result;
		
	}

	private static void reverse(int[] arr) {

		int index1 = 0;
		int index2 = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {

			int dato = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = dato;
			index1++;
			index2--;
			System.out.println();

		}
	}

	private static void switchArray(int[] numbers, int index1, int index2, int index3, int index4) {
		int i = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = i;
		int j = numbers[index3];
		numbers[index3] = numbers[index4];
		numbers[index4] = j;

	}

	private static void incrementsalary() {

		float[] salaries = { 234.324f, 23423.23f, 324.3f, 32423.34f };
		// { 235.324f, 23424.23f, 325.3f, 32424.34f };
		/**
		 * increment the value of the first data by 10 stored in the array
		 */
		salaries[0] = salaries[0] + 10;
		System.out.println(salaries[0]);

		salaries[1] = salaries[1] + 10;
		System.out.println(salaries[1]);

		salaries[2] = salaries[2] + 10;
		System.out.println(salaries[2]);

		salaries[3] = salaries[3] + 10;
		System.out.println(salaries[3]);

		// Automatizacion del proceso con bucles
		for (int i = 0; i < salaries.length; i++) {
			salaries[i] = salaries[i] + 10;
			System.out.println(salaries[i]);
		}

		int i = 0;
		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);
		i++;

		salaries[i] = salaries[i] + 10;
		System.out.println(salaries[i]);

	}

	private static void SwitchValues(int[] Values, int index1, int index2) {

		if (Values == null) {
			return;
		}

		// "||" this operator "or" used to add multiple conditions
		// if one of the conditions is true, the statements inside the if body
		// will be executed
		if (index1 < 0 || index2 < 0) {
			return;
		}

		int temp = Values[index1];
		Values[index1] = Values[index2];
		Values[index2] = temp;

	}

	private static void sumup() {
		// TODO Auto-generated method stub
		int[] scores = { 12, 34, 3423, 32 };
		System.out.println(scores[0]);// Access to the first element in the array
		System.out.println(scores[1]);// Retrieve the second element
		System.out.println(scores[2]);

		try {
			System.out.println(scores[3445]);
		} catch (Exception e) {

			e.printStackTrace();

		}
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("The total score is " + total);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore = totalScore + scores[i];
			System.out.println("totalScore = " + totalScore);
		}
		// Create an array with a capacity of storing 10000 integers
		int[] nums = new int[10000];
		System.out.println("the length of the number array is " + nums.length);

	}

	private static void findMaxiMin(int[] nums) {
		int maximum = nums[0];
		int minimum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (maximum < nums[i]) {
				maximum = nums[i];
			}

			if (minimum > nums[i]) {
				minimum = nums[i];
			}
		}

	}

	private static void initializeArray(int[] nums) {
		Random random = new Random();
		// TODO Auto-generated method stub
		int len = nums.length;
		int j = 0;
		while (len > j) {

			nums[j] = random.nextInt(-10000, 10000000);
			j = j + 1; // This operation is the same as j++
		}

	}

}