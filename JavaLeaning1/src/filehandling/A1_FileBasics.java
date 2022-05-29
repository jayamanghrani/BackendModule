package filehandling;

public class A1_FileBasics {

}
//“What is File in Java”, File is nothing but a simple storage of data, 

//in java language we call it one object belongs to Java.io package.

/*An instance of this class(File) represents the name of a file or directory on the file system. 
Also, this object can be used to create, rename, or delete the file or directory it represents. */

/*An important point to remember is that java.io.File object can represent both File and Directory in Java. 

 utility method isFile() isDirectory().*/


//Constructor

//Constructors for creating File in Java--
/*·        1.  File(String PathName) :it will create file object within the current directory

·         2. File(String dirName,string name):it will create file object inside  a directory which is passed
										as the first argument 
							and the second argument is child of that directory which can be a file or a directory
		
		
		3.  File(File dir,String name):create new file object inside the dir as a parent of the second argument
		  which can be a file name or a directory name.
		
*/		
		
		
// Java File Class Method Summary		
		
/*·          Public string getName(): returns the name of a file.

·          Public boolean exists():returns true if file exist or return false

·          Public boolean createNewFile():this method create new empty file if file not exist.
											return false if file not created and already exist.

·          Public boolean delete():delete the file and return true.

·          Public boolean mkdirs(): return true if directory created successfully or false

·          Public string getPath() :return the path or location of file object

·          CanRead() and CanWrite() for checking whether File or Directory is read-only or not.

·          setReadOnly(), listFiles() for making the file as read only in Java and listing files from a directory in Java.	
		
*/

//Whole File System is protected by SecurityManager in Java and Applets to protect User from any Internet threat.


//other Java program from untrusted source is not allowed to access File System


//IOException:
/*if anyI/O error occurred we got this Exception*/

//SecurityException: 
/*this exception we get when security Manger exist the checkWrite or checkRead method denies to access the file
*/

//IllegalArgumentException:
/*if method argument we are passing is invalid then we get this exception
*/


// MalFormedUrlException:
/*this kind of exception is generated if path cannot be parsed a URL
*/



