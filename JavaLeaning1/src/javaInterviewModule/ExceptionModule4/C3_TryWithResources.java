package javaInterviewModule.ExceptionModule4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class C3_TryWithResources
{
	
	public static void main( String[] args )
	{ 
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\JavaLearning\\test.txt")))
		{
		String line = br.readLine(); 
		SimpleDateFormat sdf= new  SimpleDateFormat("dd-MM-yyyy");  

		Date date = sdf.parse(line); 
		
		System.out.println(date);
		
		} 
		catch( ParseException | IOException ex) 
		{ 
		System.out.println("Exception "+ex); 
		} 
	}
}

		/*
		 * No finally left at all! We don’t even mention closing the reader.
		 * 
		 * Automatic Resource Management takes care of it for us. 
		 */








//Prior to Java 7 , the only solution to the problem is to use finally block.

//But it will require a lot many changes to be made:
/*
 * Declaring the BufferedReader variable outside try
 *  Initializing it with null
 * Creating a finally block 
 * Checking whether file was opened or not 
 * If it is opened , then writing a try-catch again 
 * Then inside try calling the close() method
 */


//Points To Remember With try with resources
/*
 * All the classes cannot be used in try-with-resources.
 */
/*
 * Only those classes that implements AutoCloseable can be used as a resource in
 * try-with-resources, else we will get compilation error.
 */
	/**The following will not compile:
	try(String s=“Bhopal”){ 
	
	}
	We’ll get a compiler error that looks something like:
	The resource type String does not implement java.lang.AutoCloseable
	*/

	/*
	 * AutoCloseable only has one method to implement.
		This method is called close( ) which is automatically called
	*/

	/**Multiple resources can be declared within the same try as: 
	
	try (Lion lion = new Lion(); 
	         Tiger tiger = new Tiger()) {…}
	         
	         When multiple resources are used in ‘try, then the close() method is called in the reverse order
	
	*/

