package javaio;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class BinaryDataOperations {
	
	public static void main(String[] args) {
		
		//Avariable with null initialization
		//DataOutputStream os = null ;
		
		
		
try {
	DataOutputStream os =
	new DataOutputStream(new FileOutputStream("hola.bat"));
	os.writeChar(34);


} catch (Exception e) {
	
	e.printStackTrace();
	
   }		

  }
	
}
