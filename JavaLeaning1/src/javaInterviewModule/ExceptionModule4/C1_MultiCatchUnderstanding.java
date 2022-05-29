package javaInterviewModule.ExceptionModule4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C1_MultiCatchUnderstanding {
	public static void main(String[] args) throws Exception
	{
		
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
		
	// Exception rethrow in multicatch
		
		// We can't assign exception in multicatch
		
	
		catch (IOException | ParseException ex)
		{
			/** ex= new IOException("Some promblem in I/O"); */
			throw ex;  
			// compiler ko nhi pta kiska reference aayega ex me , 
			//The parameter ex of a multi-catch block cannot be assigned
			        
		}
		 
		
		
	}	
}
