package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E3_CheckedException {

	
	public static void main(String[] args) throws FileNotFoundException
	{
		
/*	If some code within a method throws a checked exception,then the method must either handle the exception 
	or it must specify the exception using throws keyword.*/
		// in this code , we have main method 
	
		
		FileReader f= new FileReader("c:\\test\\test.txt");  //[compiler forcing to handle--Unhandled exception type FileNotFoundException]
		
		
	}
	
}
