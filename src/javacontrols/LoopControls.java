package javacontrols;

public class LoopControls {
	
	public static void main(String[] args) { 
		System.out.println(args.length);
		int num = 0;
		for (int i = 0; i < args.length; i++) {//
			System.out.println(i);
			
		}// end for
		System.out.println(" The value of the number variable is " + num);
		int j = 0;
		while (j < 10) {
			System.out.println(" The value of j is " + j);
			
			j++;
			
		
		}//end of the "while" loop
		System.out.println(" The value of j is " + j);
	}//end of the "main"			
}//end of the definition of the class

