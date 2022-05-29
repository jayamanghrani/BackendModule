package javaInterviewModule.StringCodingModule;

//1) Write a Java program to reverse String in Java without using any API?
/*This means you can not use StringBuffer's reverse() method or any of String utility method,
all you can have is a character array for reversing contents.*/


public class B4_ReverseString {

	public static void main(String[] args) {
		
		
		//  without using any API
		System.out.println(reverse("Jaya"));

		
		//quick wasy to reverse String in Java - Use StringBuffer
		
		 String word = "HelloWorld";
		 String reverse = new StringBuffer(word).reverse().toString();
	        System.out.println(reverse);
		
	     //another quick to reverse String in Java - use StringBuilder
	        String word1 = "WakeUp";
	        reverse = new StringBuilder(word1).reverse().toString();
	        System.out.println(reverse);
		
	}

	public static String reverse(String str) {
		
		if(str!=null)
		{
			String reverse="";
			int len= str.length();
			
			for(int i=len-1 ;i>=0; i--)
			{
				reverse=reverse+str.charAt(i);								
			}	
			return reverse;
		}
						
		return null;
	}
	
	
}
