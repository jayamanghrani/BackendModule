package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F7_ReadFileByFileReader {

	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\JavaLearning\\filehandling\\test.txt");
		
		int character= fr.read();  //[provide all the character present in string]
		System.out.println("No of character in file"+character);
		
		while(character!=-1)
		{
			System.out.println((char)character);
			
			character=fr.read();
		}
		
		
	}
	
	
	
	
}
