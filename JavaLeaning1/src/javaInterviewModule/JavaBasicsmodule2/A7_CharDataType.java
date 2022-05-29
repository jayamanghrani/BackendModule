package javaInterviewModule.JavaBasicsmodule2;

public class A7_CharDataType
{
	public static void main(String[] args) {
		
		System.out.println("let's print hindi");
		
		/*
		 * Unicode contains code points for almost all representable graphic symbols in
		 * the world and it supports all major languages e.g. English, Japanese,
		 * Mandarin, or Devanagari.
		 */


		char ch= '\u0915';  // This is unicode (Unicode is a character set of various symbols
		char ch1= '\u0916';
		char ch2= '\u0917';
		char ch3= '\u0918';

		System.out.println(ch+" "+ch1+" "+ch2+" "+ch3); // ? ? ? ?
		
		
		/*To print hindi letters
		 * In Eclipse:
		 * 
		 * You need to change your Eclipse Console encoding to UTF-8/UTF-16. To do so, go into
		 * your Run Configuration dialog and select the Common tab. Under Encoding,
		 * choose UTF-8. Now run your program. You should see hindi characters printed
		 * in the Eclipse console.
		 */
		
		
		char v= '\u0966';
		for(int i=1;i<=10;i++)
		{
			System.out.print(v++); 
		}
		
		
		
		
		
		
		
	}
	
	

}

// Char is of 2 byte , because char follow unicode no system.
/* esa no.system jo world ki max spoken lang ko cover krta h. */


/**
 * In java almost 61 lang are supported, including japanese, korean, chinese,
 * hindi, spanish and others.

 C doesn't support hindi beacuse it follow ASII no. system , ASCII 1 byte ka rkhti h.
 1 byte me sirf english vale letter hi aa pate h */


/*
 * English ke alva kuch aor rkhna ho to 2 byte chaeye rehti h. That's why java
 * is internationalization, support all international languages , whatapp
 * support al lang
 */


// Interview question-

//how to write hindi charcter in java?

		/**To assign unicode values we have two options:
			
			a) Use the numeric value 
			b) use the format  hexadecimal value */ 


		/*
		 * https://www.anirdesh.com/gujarati/hindi-unicode.php
		 */



//character encoding is how many bytes it requires to represent a character in memory.


//  Unicode (\u0915) is a character set of various symbols 

//while UTF-8, UTF-16, and UTF-32 are different ways to represent unicode in byte format.
//Both UTF-8 and UTF-16 are variable-length encoding,
//where the number of bytes used depends upon Unicode code points. 



//Difference between UTF-8, UTF-16 and UTF-32 Character Encoding? Example

		/*
		 * UTF-8 uses a minimum of one byte, 
		 * while UTF-16 uses a minimum of 2 bytes.
		 */


//1. UTF-8 uses one byte at the minimum in encoding the characters while UTF-16 uses minimum two bytes.
		/*
		 * In UTF-8, every code point from 0-127 is stored in a single bytes. Only code
		 * points 128 and above are stored using 2,3 or in fact, up to 4 bytes. In
		 * short, UTF-8 is variable length encoding and takes 1 to 4 bytes, depending
		 * upon code point. UTF-16 is also variable length character encoding but either
		 * takes 2 or 4 bytes. On the other hand UTF-32 is fixed 4 bytes.
		 * 
		 * 
		 * 
		 * 
		 * 2) You might think that because UTF-8 takes fewer bytes for many characters
		 *  it would take less memory than UTF-16, well that really depends 
		 *  on what language the string is in. For non-European languages, 
		 *  UTF-8 requires more memory than UTF-16.

		 */

//javarevisited
//How to get and set default Character encoding or Charset in Java? Example

//Character Encoding and String