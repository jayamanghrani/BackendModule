package javaInterviewModule.ExceptionModule4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A6_CheckedException {

	public static void main(String[] args) throws FileNotFoundException
	{
		
/*	If some code within a method throws a checked exception,
 * then the method must either handle the exception 
	or it must specify the exception using throws keyword.*/
		// in this code , we have main method 
	
		
		FileReader f= new FileReader("c:\\test\\test.txt");  //[compiler forcing to handle--
														//Unhandled exception type FileNotFoundException]
			
	}	
}
 
//Checked Exception are those exception which checked at compile time.

/*
 * 1. are the exceptions that are checked at compile time.
 * 
 * 2. forced by the compiler to either handle or specify the exception.
 * 
 * 
 * 3. If some code within a method throws a checked exception, then the method
 * must either handle the exception or it must specify the exception using
 * throws keyword.
 * 
 * 4. Ex-FileNotFoundException, IOException
 * 
 */


