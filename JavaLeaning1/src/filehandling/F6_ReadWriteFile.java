package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F6_ReadWriteFile
{
	
public static void main(String[] args) throws IOException {
	
	File input = new File("C:\\JavaLearning\\filehandling\\test.txt");
	
	File output = new File("C:\\JavaLearning\\filehandling\\output.txt");
	
	
// We can use FileReader and BufferReader to read the file , it can read char, char[], line but can't read object
/*	We should use FileInputStream to read object , image
	InputStream is used to read data from sources like File, Socket, or Console*/


//	And we can use FileWriter and printWriter to write 
/*	We should use FileOutputStream to write object , image
	while OutputStream is used to write data into a destination like a File, Socket, or Conole.*/

	
	
	//let's take FileInputStream
	
	FileInputStream fin = new FileInputStream(input);
	
	FileOutputStream fout = new FileOutputStream(output);
	
	int count;
	while((count=fin.read())!=-1)
	{
		
	fout.write(count);
	}
	
	fin.close();
	fout.close();
}







}