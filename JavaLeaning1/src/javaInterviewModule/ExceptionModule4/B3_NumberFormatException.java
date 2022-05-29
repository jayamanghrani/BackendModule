package javaInterviewModule.ExceptionModule4;

public class B3_NumberFormatException 
{
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt("123"));  //123
		System.out.println(Integer.parseInt("-123")); //-123
		System.out.println(Integer.parseInt("+123")); //123
		System.out.println(Integer.parseInt("+123_45")); // java.lang.NumberFormatException
		System.out.println(Integer.parseInt("123ABCD")); // java.lang.NumberFormatException
	}
	
	
}


// Mostly occurs in wrapper classes