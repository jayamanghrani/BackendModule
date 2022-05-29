package javaInterviewModule.StringCodingModule;

public class B1_StringIntro {

	public static void main(String[] args) {
		
		String strPassword="Unknown";
		char[] charPassword= new char[]{'U','n','k','w','o','n'};
		
		System.out.println("String password: " + strPassword);
		System.out.println("Character password: " + charPassword);
		
		
		/*1*/
		String s="Jaya"; // It will go in pool
		
		
		/*2*/
		char[] arr= {'S','A','M'};		
		String str= new String(arr); // only in heap , because we didn't use ""
		
		/*3*/
		String s2= new String("Jaya"); // pool ("Jaya") +heap (new), This is memory consuming
		
		
		/*
 * ****************************************************************************** *************************
		 */		
		
		System.out.println("calling show");  // (calling show)will create in pool 
		
		int len ="calling show".length();
		System.out.println(len);
		
		String x="Sachin";  // Sachin created in pool
		show(x);
	
		
		
	}
	
	public static void show(String s)
	{
		String s1= "Sachin";  //Sachin is already created in pool
		System.out.println(s1==s);  //true , we can proff by checking both address
									

		
		String t1= new String("Sachin");//Sachin will created in heap and in pool it is already created 
		System.out.println(t1==s); //false we can proff by checking both address
		
		String t2= new String("Sachin");
		System.out.println(t1==s); 
	}
	
}
	
	
/* public final class String extends Object implements Serializable, Comparable<String>, CharSequence*/
	
	
/*	The String class represents character strings
	
    String str = "abc";
	 
		is equivalent to:

     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
}
*/

//Interview questions - 


//1. what is String ?
/*		String is predefined class in java.
		String is immutable in nature.*/

	// how many ways are there to create string object
	
	/*	by two ways- 
		a) String literal
		b) by using new keyword*/
		
		
	//What is the String pool in Java?

/*	String pool is a special storage area in Java heap
	
	When the Java program creates a new String using String literal, 
	JVM checks for that String in the pool and if String literal is already present in the pool 
	then the same object is returned instead of creating a whole new object. */

/*	String pool check is only performed when you create String as literal, 
	if you create String using the new() operator, a new String object will be created in heap 
	
	 * all strings in pool will be unique.
	 * 
	 * pool me data compile time pe jata h.
	 * 
	 * jab "" me likhte h , to data pool me jata h
	 *
	 *they destroy when JVM shut downs.
	 *
	 */


/**
 * String goes in either heap/pool area.
 *  String buffer and builder goes to heap area only
 */


//) What does the intern() method do in Java?

/*intern method allows putting a String object into a pool.*/



//2. Why is String final and immutable in Java?		
		
/*		Security and String pool being primary reason of making String immutable,
				
		1) Imagine String pool facility without making string immutable, its not possible at all because
		 in case of string pool one string object/literal e.g. "Test" has referenced by many reference variables, so if any one of them change the value others will be automatic gets affected i.e. let's say
		String A = "Test"
		String B = "Test"	
		Now String B called, "Test".toUpperCase() which change the same object into "TEST"		
		 so A will also be "TEST" which is not desirable.
		

		 2)2. String has been widely used as a parameter for many Java classes 
		 e.g. for opening network connection, you can pass hostname and port number as a string, 
		 you can pass database URL as a string for opening database connection,
		 you can open any file in Java by passing the name of the file as an argument to File I/O classes.
		 
		 In case, if String is not immutable, this would lead serious security threat,
		 */
		 

//3. What is the difference between String and StringBuffer and StringBuilder in Java? 


	//String 			JDK 1.0
/*		Since String is immutable in Java every operation which changes String produces a new String,
		which can be avoided by using StringBuffer.*/

	//String Buffer		JDK 1.0
/*		StringBuffer is very good with mutable String but it has one disadvantage
		all its public methods are synchronized which makes it thread-safe but same time slow. */		
		
	//String Builder	JDK 5.0
/*		StringBuilder in Java which is a copy of StringBuffer but without synchronization. 
		Try to use StringBuilder whenever possible it performs better in most of the cases.*/



//4. Why char array is better than a String for storing passwords? 
		
/*	1) Since Strings are immutable in Java if you store the password as plain text
	it will be available in memory until the Garbage collector clears it.	
		there is a pretty high chance that it will remain in memory for a long duration, which poses a security threat. */
	
	/*Since Strings are immutable there is no way the contents of Strings can be changed
	because any change will produce new String, 
	while if you char[] you can still set all his elements as blank or zero. 
	Storing the password in a character array clearly mitigates security risk of stealing passwords.*/
		
		
/*3) With String there is always a risk of printing plain text in a log file 
or console but if use Array you won't print contents of the array instead its memory location gets printed. 
*/


//5. How do you compare two String in Java? 

/*Here are four examples of comparing String in Java
1) String comparison using equals method
2) String comparison using equalsIgnoreCase method
2) String comparison using compareTo method
4) String comparison using compareToIgnoreCase method*/


//6. Is string thread-safe in Java? 
/*Since String is immutable, it is thread-safe and it can be shared between multiple threads
 *  without external synchronization.
 *  
 *  Thread safe means at a particular moment of time only one thread can access. 
 *  
 *  Thread safety avoid RACE conditions.
 *  
 *  
 *  
*/

// How can we achive thread safety?
/*
 * Mutable 
 * Final 
 * Locking using synchronize
 */


/** difference b/w String and StringBuilder --will discuss
 * 
 *  
 *  String---
 *  
 *  String days="";
 *  days= days+"Mon";
 *  days= days+"Tues";
 *  days= days+"Wed";
 *  days= days+"thrus";
 *  days= days+"frid";
 *  days= days+"sun";
 *  
 *  
 *  
 *  StringBuffer---
 *  
 *  				StringBuilder ="" --incorrect 
 *  StringBuilder sb = new StringBuffer();
 *  sb.append("Mon");
 *  sb.append(Tues);
 *  
 *  
 *  
 *  
 *  
 *  */







/*		Other Java String tutorials from Javarevisited Blog
		Why Char array is better than String for storing password
		How to Split String in Java with Example
		How to convert Collection to String in Java
		How to convert String to Date in Java 
		How to replace String in Java
		How to convert String to Integer in Java*/




