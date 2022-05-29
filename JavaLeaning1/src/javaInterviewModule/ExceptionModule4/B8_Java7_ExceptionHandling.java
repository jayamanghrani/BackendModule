package javaInterviewModule.ExceptionModule4;

import java.io.*;
import java.text.*;
import java.util.Date;

//consider designing a code that reads a string representing a date written in a file and then converts it to proper Date object.

public class B8_Java7_ExceptionHandling {

	public static void main(String[] args)  {
		
		
		try {
			BufferedReader br= new BufferedReader(new FileReader("C:\\JavaLearning\\test.txt"));
			
			String str= br.readLine();  // read date from file as string
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
			
			/*
			 * SimpleDateFormat has 2 method 
			 * 1. Format -convert date to string
			 *  2.parse- convert string to date
			 * 
			 */	
			Date obj = sdf.parse(str);
			System.out.println("date is -"+obj);
			
		} 
		
		// Now exception handling
	
		/**catch (IOException e)
		{
			System.out.println(e);
		}
		
		catch(ParseException e)
		{
			System.out.println(e);
		}
		
	
		*/
		
		
		/* java says in both catch you have same body , use Multi catch */
		
		
		catch(IOException |ParseException ex)
		{
			System.out.println(ex);
			
		}
	
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}

//Java 7 New Enhancements To Exception Handling

/*
 * from Java 7 onwards , java has provided us 2 new enhancements to exception
 * handling code.
 * 
 * They are:
 * 
 * 1.  Multiple exception types in a single catch block.
 * 
 * 2.  Try-with-resources statements
 */



//Rules for Multi catch

// Normal catch me pehle child then parent aa sakta h but 

/*
 * 1. Multicatch me parent child nhi aa sakte.
 */

/** catch(IOException | FileNotFoundException )
	{
		System.out.println(ex);  
			msg from compiler -----//FileNotFoundException is subclass of IOException
		
	}
	
	catch(FileNotFoundException| IOException) 
	{
		System.out.println(ex);  
			msg from compiler -----// FileNotFoundException is subclass of IOException
		
	}
		
*/

/* 2. Java has given multicatch for what purpose? */
			/** To use different hierarchy of Exception in one catch */



