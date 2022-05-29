package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//You can also see how easy it is to read a file line by line using BufferedReader.


public class F5_ReadFileByBufferRedaer {

	public static void main(String[] args) throws IOException {
		
		
/*		we will read a text file from C:\  drive in Windows machine 
 * but since Java is platform-independent and we have used PATH separator as a forward slash,
 *  it should work on any other UNIX based system e.g. Linux, Solaris, or IBM AIX.
 *   This is the most simple and standard way of reading the file in Java. 
 *     
*/
		
/*		 * Java API provides FileInputStream to open file for reading.
		 * for improved performance it's advised that use Reader for reading contents
		 * By using InputStreamReader you can convert an InputStream into Reader.
		 * BufferedReader provides better performance while reading files in Java.*/

		
		
		
		FileReader fr = new FileReader("C:\\JavaLearning\\filehandling\\test.txt");
		
		BufferedReader buf = new BufferedReader(fr);
		
		//redaing file content line by line
		
		String line= buf.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line= buf.readLine();
		}
		
		//read file content one by one
		// need to do , not completed
		int onebyone = buf.read();
		System.out.println(onebyone);
	}
	
	
}
