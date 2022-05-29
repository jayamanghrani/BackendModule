package javaInterviewModule.StringCodingModule;

import java.io.UnsupportedEncodingException;

public class B9_ByteArrayToString {

	
	public static void main(String args[]) throws UnsupportedEncodingException {
	       
        byte[] random = new byte[] { 71, 69 ,69 ,75};
       
        String utf = new String(random, "UTF-8");  //GEEK
        String cp1252 = new String(random, "Cp1252"); //GEEK
        String windows1252 = new String(random, "Windows-1252"); //GEEK
        String str = new String(random, "UTF-16");
        String str1 = new String(random, "UTF-32");
       /* String s = new String(random, "Cp");*/ // INCORRECT ENCODING TAKING
        

        
        
     
        System.out.println("String created from byte array in UTF-8 encoding :" + utf);
        System.out.println("byte array to String in Cp1252 encoding : "  + cp1252);
        System.out.println("byte array to String in Windows-1252 encoding : "+ windows1252);
        System.out.println("byte array to String in UTF-16 encoding : "+str);
        System.out.println("byte array to String in UTF-32 encoding : "+str1);
       /* System.out.println(s);*/ // Exception
       
    }
	
}


/*There are multiple ways to convert a byte array to String in Java
but the most straightforward way is to use the String constructor 
which accepts a byte array i.e. new String(byte []) , */
				//but the key thing to remember is character encoding.


/*Since bytes are binary data but String is character data,
it's very important to know the original character encoding of the text from which byte array has created.*/

//If you use a different character encoding, you will not get the original String back.

/*
For example, if you have read that byte array from a file which was encoded in "ISO-8859-1" 
and you have not provided any character encoding
while converting byte array to String using new String() constructor
then it's not guaranteed that you will get the same text back?
Why?
		because new String() by default uses platform's default encoding 
		(e.g. Linux machine where your JVM is running), which could be different than "ISO-8859-1".*/


//Yes, there is another overloaded constructor in String class 
//which accepts character encoding i.e. new String(byte[], "character encoding").



/*cp1252, which is the default character encoding in Eclipse
windows1252 another popular encoding in Windows, 
UTF-8, which is a default standard character encoding in the world.*/



//Difference between UTF-32, UTF-16 and UTF-8 encoding

	//UTF-8, UTF-16, and UTF-32 are different ways to represent them in byte format.

/*Once Unicode character is converted into bytes, 
it can be easily persisted in the disk, transferred over network and recreated at other end. */

/*1. UTF-8 uses one byte at the minimum in encoding the characters while UTF-16 uses minimum two bytes.

2. UTF-8 is compatible with ASCII while UTF-16 is incompatible with ASCII*/

/*Java Strings are represented using UTF-16 bit characters, earlier they use USC2, which is fixed width.*/ 
