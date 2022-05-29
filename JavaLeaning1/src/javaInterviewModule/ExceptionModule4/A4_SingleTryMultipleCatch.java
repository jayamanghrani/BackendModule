package javaInterviewModule.ExceptionModule4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A4_SingleTryMultipleCatch {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try
		{
			fis= new FileInputStream("file.txt");
			System.out.println("File opened");
			fis.read();
			System.out.println("Read file");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		catch(IOException ex)
		{
			System.out.println("File closing exception");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("New task");
	}
	
	
}


//Will a finally block execute even if the catch block defines a return statement?

/*
 * Yes , a finally block will execute even if the code in the try block or any
 * of the catch blocks defines a return statement.
 */


//When will finally not execute ?
/*
 * Application termination-The try or the catch block executes System.exit(), which terminates the application 
/**Exception occurs before try 
Fatal errors—A crash of the JVM or the OS 
*/

//What happens if both a catch and a finally block define return statements?
/*
 * If both catch and finally blocks define return statements, the calling method
 * will receive a value from the finally block.
 */

