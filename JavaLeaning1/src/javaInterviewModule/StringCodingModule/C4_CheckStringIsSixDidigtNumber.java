package javaInterviewModule.StringCodingModule;

import java.util.regex.Pattern;

//Regular expression in java to check if String is 6 digit number or not

public class C4_CheckStringIsSixDidigtNumber 
{
	public static void main(String[] args) 
	{
		
		 String [] numbers = {"123", "1234" , "123.12", "abcd123", "123456"};
	       Pattern digitPattern = Pattern.compile("\\d{6}");       
	       //Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d");
	       

	       for(String number: numbers){
	           System.out.println( "does " + number + " is 6 digit number : "
	                               + digitPattern.matcher(number).matches());
	       }


		
		
	}
}
