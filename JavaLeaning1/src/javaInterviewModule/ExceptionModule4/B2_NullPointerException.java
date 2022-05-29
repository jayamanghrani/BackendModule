package javaInterviewModule.ExceptionModule4;

import java.util.ArrayList;

public class B2_NullPointerException {

	static ArrayList<String> list =null;	
	static String[] oldLaptops;           //global variables ko java initialize krti h
	
	public static void main(String[] args) 
	{
				list.add("1"); // NullpointerException
				
			System.out.println(oldLaptops[1]);	// NullpointerException
											//null pe operation perform kro to nullpointer aata h, here accessing 1st element of null
			
			
/* ****************************************************************************************************** */			
			
			String str= null;
			System.out.println(str); // null
			System.out.println(str.toString()); // nullpointer
			
			
			/** Java 14 */
			
			/**
			 * Java 14 enhances NullPointerException by showing precisely error msg which variable was
			 * null.
			 * 
			 * This feature can be enabled with the new boolean command-line option:
			 * -XX:+ShowCodeDetailsInExceptionMessages

			 */
			
			
			
/* ****************************************************************************************************** */			
			
			String[] newLaptops = new String[2];
			
			/*
			 * newLaptops ----0 (null) 
			 * 			  -----1(null)
			 */
			
			
			System.out.println(newLaptops[1]);  // null
			
			System.out.println(newLaptops[1].toString()); // NullpointerException
			
			System.out.println(newLaptops[2].toString());  //ArrayIndexOutOfBoundsException
			
			
/* ****************************************************************************************************** */			
		
String[ ][ ] oldLaptops = { {"Dell", "Toshiba", "Vaio"}, null, {"IBM"}, new String[10] };
			
			/*				          0       1         3
			 * oldLaptops    ---0 {"Dell", "Toshiba", "Vaio"}
			 * 
			 *  			-----1 null 
			 *  
			 *  					 0
			 *  			-----2 {"IBM"}
			 *  
			 *  							
			 *  			 ----3 new String[10] -[0 1 2 3 4 5 6 7 8 9 10 ]
			 * 
			 * 
			 */

			System.out.println(oldLaptops[0][0]); 	// Dell
			System.out.println(oldLaptops[1]); 	//  null
			System.out.println(oldLaptops[3][6]); 	// null
			System.out.println(oldLaptops[3][0].length()); // nullpointer
			System.out.println(oldLaptops); // [[Ljava.lang.String;@15db9742  hashcode

			
			
			
			
			
			
	}
	
	
}


//NullPointerException