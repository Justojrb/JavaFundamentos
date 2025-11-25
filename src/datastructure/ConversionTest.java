package datastructure;


import oopmodeling.Celestialbody;
import oopmodeling.Planet;
import oopmodeling.Planeta;
import oopmodeling.Star;

/*
 * 
 *
 * @author Justo
 * 25 nov 2025
 */

public class ConversionTest{
	
	public static void main(String[] args) {		
		
		primitiveConversion();
		
	
		objectConversion();
		
	}
	
	private static void objectConversion() {
		//Polymorphism
				Planet p1 = new Planet();
				//A planet is not a star, we cannot assign a planet object to a star object
		        //Star s1 = (Star) new Planet();
				//In the following two cases, a planet is of type CelestialBody and Object
				Celestialbody p2 = new Planet();
				Object p3 = new Planet();
				Object p4 = new Celestialbody();
				
				Planet p5 =(Planet) p3;
				System.out.print(p5);
				System.out.print(p3);
				System.out.println(p5 == p3);
				
				Object[] planets = new Planeta[20];
				Planeta[] plsPlanetas = (Planeta[]) planets;
				
				/**
				 * 1 create an array of object of size of 20
				 * 2 assign each position of the array with an object of type  planet
				 * 3 convert the whole array explicitly to an array of planet		
				 */
				
				Object[] objs = new Object[20];
				objs[0] = new Star();
				objs[0] = new Planeta();

				for (int i = 0; i < objs.length; i++) {
					objs[i] = new Planeta ();
				}
		
	}

	private static void polymorphismMethod(Celestialbody cb) {
		
		//an algorithm that processes an object of CelestialBody type
		
	}
	
	private static void primitiveConversion() {
		
		int num1 = 200;
		byte num2 = 127;
		float num3 = 324.4f;
		double num4 = 34;
		num1 = num2;
		System.out.println(num1);
		num1 = 129;
		System.out.println(num1);
		//explicit conversion from an integer to a byte number
		num2 = (byte) num1;
		System.out.println("El número 2 es: " + num2);
		//Even explicity we can not and should not cast an int array to a byte nor the contrary
		//because the process is complicated to do and so useful
		int [] nums1 = new int[23];
		byte[] nums2 = new byte[23];
		//nums1 =(int)nums2;
		//nums2 =(byte)nums1;
		
		
	}

}