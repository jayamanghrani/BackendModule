package filehandling;

import java.io.File;

//Which class is used to create a directory in Java?
/*This is tricky becuase there is no Directory class, File class is used to create both file and directory in Java.
java.io.File object 
*/


public class F2_CreateDirectory {

	public static void main(String[] args)
	{
		boolean flag= false;
		File f= new File("C:\\JavaLearning\\filehandling");
		
		try
		{
		flag=f.mkdir();  //[this will throw runtime exception , so compiler is not forcing ]
					// it's programmer choice to handle this
		
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		
		
		if(flag)
		{
			System.out.println("directory created successfully");
		}
		
		else
		{
			System.out.println("not created");
		}
	}
	
	
	
	
}
