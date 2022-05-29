package filehandling;

import java.io.File;

public class F1_CreateFile {

	public static void main(String[] args)
	{
		boolean flag= false;
		File f= new File("C:\\JavaLearning\\filehandling\\test.txt");
		
		try
		{
		flag=f.createNewFile();  
					
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		if(flag)
		{
			System.out.println("file created successfully");
		}
		
		else
		{
			System.out.println("not created");
		}
	}

}


//“What is File in Java”, File is nothing but a simple storage of data, 


