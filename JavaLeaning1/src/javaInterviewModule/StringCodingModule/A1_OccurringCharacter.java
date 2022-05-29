package javaInterviewModule.StringCodingModule;


//1) How to find the partcular character count  in a given String? (solution)
/**Write an efficient Java/C/Python program to return the maximum occurring character in the input string,
		e.g., if the input string is "Java" then the function should return 'a'.*/

public class A1_OccurringCharacter
{
public static void main(String[] args) 
{
	
	String str="Java";
	
	int a_charCount=0;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a')
			a_charCount++;
		
	}
	System.out.println("Occurence of a character in "+str+ " is ->"+a_charCount);
}
	
}
