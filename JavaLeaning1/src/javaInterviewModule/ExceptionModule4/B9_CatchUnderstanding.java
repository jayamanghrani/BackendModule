package javaInterviewModule.ExceptionModule4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B9_CatchUnderstanding 
{
public static void main(String[] args) throws IOException
{
	
	try {
		BufferedReader br= new BufferedReader(new FileReader("C:\\JavaLearning\\tes.txt"));
		
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
	
// Exception rethrow
	catch (IOException ex)
	{
		ex= new IOException("Some promblem in I/O");
		throw ex;           // whenever we throw exception , it will be handled by caller of method i.e. JVM
	}
	 
	catch(ParseException e)
	{
		System.out.println(e);
	}
	
}	
}

 
/* 3.     
 *      try me exception aata h to ----catch me jata h        
 *        
 *      catch me aata h to ---- caller ke pass       
 *                        
 *  */

// throw 

/*
 * 1. We can either throw checked or unchecked exception from method.
 * 2. Can't  throw multiple exception. 
 * 3. throw keyword in java is used to explicitly throw an exception from a method or any block of code
4. whenever we throw exception , it will be handled by caller of method
 */





