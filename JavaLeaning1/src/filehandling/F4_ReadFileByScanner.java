package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F4_ReadFileByScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\JavaLearning\\filehandling\\test.txt");
		
		
		/*	The scanner provides methods like hasNextLine() and readNextLine() 
		which can be used to read file line by line. 
		It's advised to check for next line before reading next the line to avoid NoSuchElementException in Java.  
	*/

		
		Scanner scr = new Scanner(f);
		
		//Reading each line of the file using Scanner class

		int lineNumber=1;
		while(scr.hasNextLine())
		{
			String line= scr.nextLine();
			System.out.println("line"+lineNumber+"-"+line);
			lineNumber++;
		}
		
		
	}
	
	
	
	

}
