package javaInterviewModule.Stringmodule5;

public class A1_EmptyString {
	
	public static void main(String[] args) {
		
	
		/*
		 * Empty string */	
	String str= "";  //empty string
	System.out.println(str.length()); //0
	
	
	String str1=" "; // This is not empty string, it contain space
	System.out.println(str1.length()); //1
	
	
	String word=new String(); // empty
	System.out.println(word.length()); //0

	
	
	/*
	 * Null String
	 */	
	String s= null; // null string
	//System.out.println(s.length());---null pointer

	
	
/*	Uninitialized String
*/		
	String name; // when class will instantiate , it will become null or null reference
	
	}
}
