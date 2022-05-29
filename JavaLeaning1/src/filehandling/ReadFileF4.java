package filehandling;

public class ReadFileF4 {

	// We can read a file using Scanner, FileReader, FileInputStream, BufferedReader
	
	
	
	
// FileReader
	
	
	
	
	
// FileInputStream	
/*	If we are working on Standalone application then we have access to local file system 
	and we can easily using the java API read and write on files, 
	but we if we our application is running on browser based system 
	then this will not work. If we are using input and output stream for reading 
	and writing it’s very easy to understand.*/
	
	
/*	one important point here is that FileInputStream should not be used to read character data file.
	It is meant for reading binary data such as an image file.*/

	
	

	
//BufferReader
/*	If needed use buffering  it’s a good practice because calling
	a read() method for single byte JVM will call the native operating system method 
	and  calling a operating system method is expensive so Buffering will reduce this overhead from some extent.*/

	
	
	
	
}
