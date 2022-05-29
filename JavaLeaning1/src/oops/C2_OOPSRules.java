package oops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Always program for the interface and not for application; 
		/*this will lead to flexible code that can work with any new implementation of the interface.*/

//So use interface type on
//1.variables, 
//2.return types of method
//3.argument type of methods in Java.


/*This has been advised in many Java books,
*/

/*1. Static factory method used in factory design pattern enforces
use of Interface than implementation which itself a good practice.

for example:List<String> rawdata = Arrays.asList("one", "two", "three");

*/


public class C2_OOPSRules {

	public static void main(String[] args) {
				
		/*Using interface as variable types*/
		
		List<String> rawdata = Arrays.asList("one", "two", "three");
		List<String> allcaps = toCapitalCase(rawdata); 
		
		System.out.println(allcaps);
	}
	

	/*Using interface as type of arguments and return type*/
	public static List<String> toCapitalCase(List<String> msg)
	{
		
		return msg.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		
	}
	
	
	
	
	
	
	
	
}
