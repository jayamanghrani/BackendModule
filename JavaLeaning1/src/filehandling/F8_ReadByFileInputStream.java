package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F8_ReadByFileInputStream {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream f = new FileInputStream("C:\\JavaLearning\\filehandling\\test.txt");
		
		int character= f.read();
		System.out.println("character-"+character);
		
		while(character!=-1)
		{
			
		}
	}
	
	
	
}
