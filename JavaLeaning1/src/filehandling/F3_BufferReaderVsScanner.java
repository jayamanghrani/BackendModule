package filehandling;

public class F3_BufferReaderVsScanner {}


// Difference between
//1. Scanner

/*Scanner is usually used to read user input
*/
 /* Scanner can read both String and other data types like int, float, long, double, float, etc.*/

/*you should use Scanner if an input is not big and you also want to read different types of input like int, float, and String.
*/

/*Scanner is newer than BufferedReader, only introduced in Java 5,*/

/*but for short input and input other than String, you can use Scanner class.*/

/*It can accept custom delimiter and parse text into primitive data type
 *  e.g. int, long, short, float or double using nextInt(), nextLong(), nextShort(), nextFloat(),
 *   and nextDouble() methods,
*/


//2. BufferReader
/*BufferedReader is commonly used to read a file line by line in Java.
*/

/*Use BufferedReader is you want to read the text without parsing.
Since it has a larger buffer, you can also use it to read long String in Java.*/


/* BufferedRedaer can only read String*/

/*BufferedReader is present in Java from JDK 1.1 version*/

/*BuffredReader has a significantly large buffer (8KB) than Scanner (1KB), 
   which means if you are reading long String from a file, you should use BufferedReader*/


/*BufferedReader is synchronized while Scanner is not. 
*/

/*This means, you cannot share Scanner between multiple threads but you can share the BufferedReader object.
*/

/*This synchronization also makes BufferedReader a little bit slower in the single-thread environment as compared to Scanner,
*/
