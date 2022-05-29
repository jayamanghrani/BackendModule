package javaInterviewModule.JavaBasicsmodule1;


//What are identifiers?
		
/* Any name in java prog is called an identifier */


//They are used with-
/* class 
 * interface
 * method
 * variable name
 * label name
 * package name
 * enum

 * */
 
//Rule 1---
/* only character allowed[a-z, A-Z ,0-9 , _, $] */


//how many identifiers are there in code
class Sample
{
	/*none of them are legal, all illegal
	 * int :b;
	 * int -d;
	 * int e#;
	 * int .f;
	 * int 7g;
	 */
	
	
	/*
	 * all are legal
	 *  int _a;
	 *  int $C;
	 *  int ___2_W;
	 *  int _$;
	 *  int this_is_a_very_detailed_name_for_an_identifier
	 *  int $_weigth;
	 *  
	 */
	
	
	
	public static void main(String[] args)
	{
		int x= 10;
		System.out.println(x);
		
	}
	

}

// 8 identifiers are there in code 
/*
 * Sample- class name 
 * main- method name
 *  String- class name
 *   args- variable name
 * x- var name
 *  System- class name
 *   out - var name 
 *   println- method name
 */


//Rule 2- 
/*
 * Identifiers can't start with digit i.e. , 123 name is not valid
 */

//Rule -3 
/*
 * Identifier are case sensitive . so Name, name, NAME all are diffrent
 */

//Rule 4- 
/* No lenght limit for identifiers. but not recommended */


//Rule 5-
/* Can't use reserve word in identifiers ,
 *  int if=20 compilation error 
 *  */

// Rule 6-
/*
 * ALl predefined java class names and interface names can be used as
 * identifiers
 * 
 *  int String = 10; no error , bad programming practice.
 *  
 *  Ex refer - O2_Example.java
 */




