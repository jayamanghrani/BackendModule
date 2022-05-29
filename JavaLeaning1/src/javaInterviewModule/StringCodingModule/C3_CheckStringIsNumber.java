package javaInterviewModule.StringCodingModule;

/*Java supports regular expression using java.util.regex.Pattern
 *  and java.util.regex.Matchter class,
 *   you can see a dedicated package java.util.regex for a regular expression in Java. 
 *   Java supports regex from JDK 1.4,
*/

import java.util.regex.Pattern;

//) Check if a String is a number or not using regular expression



public class C3_CheckStringIsNumber
{
	public static void main(String[] args)
	{
		/*   \d will represent a digit (0-9)   */
		/**
		 * \D will represent a non-digit (anything other than 0 to 9).
		 */
		
		//a String will not be a number if it contains any non digit characters,

		
		String input1= "abcdef";
		String input2= "123456";
		
		Pattern pattern = Pattern.compile(".*\\D.*");
		
		boolean res1=pattern.matcher(input1).matches(); //true
		
		System.out.println(res1);
		
		boolean res2=pattern.matcher(input2).matches(); // false
		
		System.out.println(res2);
		
	}
}
