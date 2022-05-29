package javaInterviewModule.ExceptionModule4;
import java.io.*;
import java.text.*;
import java.util.*;


//In our BufferedReader example there is a problem!

//The problem is that there is no cleanup of the resources being used inside the try block. 
//In simple words , we are not closing the file opened in try block.


public class C2_TryWithFinally
{
	public static void main( String[] args ) 
	{ 
		BufferedReader br=null;
		try 
		{ 
			br = new BufferedReader(new FileReader("C:\\JavaLearning\\test.txt"));
			String line = br.readLine(); 
			SimpleDateFormat sdf= new SimpleDateFormat("MM/DD/YY");  
			Date date = sdf.parse(line); 
		} 
		
		catch(ParseException ex1) 
		{ 
		System.out.println("Exception:"+ex1); 
		} 
		
		
		catch(IOException ex2) 
		{ 
		System.out.println("Exception:"+ex2); 
		 }

		finally
		{
		if(br!=null)
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{ 
				e.printStackTrace();
			}
		}
		}
		
		}
	}


	/**
	 * In  this code , finally me kitna kuch likhna pdh rha , better option is to use try with resources.
	 * 
	 * A much better and elegant solution to the this problem is to use Java 7’s new
	 * try with resources statement.
	 */

