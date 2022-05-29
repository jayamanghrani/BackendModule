package javaInterviewModule.JavaBasicsmodule2;

public class A5_IntegerDataTypes {

	public static void main(String[] args) {
		
		int decimal = 267;		
		int octVal = 0413; /* [aage 0 lga diya matlab ab ye decimal nhi rha] */		
		int hexVal= 0x10B;		
		int binVal= 0b100001011;
				
		/**int a= 09; Error - 0 lgaya h, to ye octal and octal ka range(0-8) The literal 09 of type int is out of range*/ 
		
		
		/* With java7 we can also use underscore to make more readable */	
		long d = 100_267_760;
		
		/**long a = 10;*/ /* [java bydefalut assume 10 as integer] */
		
		long b = 10l; /* suffix required */
		long c= 10L;
		
		
		
	}
		
	}	



//Data Type-- divided into two category

/*
 * 1. Primitive - predefined 
 * 2. Non-primitive - defined by programmer
 */

	// Primitive data type-
	/* Integers - byte(1 byte), short(2 byte) , int(4 byte), long(8 byte) [when value is whole number]
	 * 
	 * Floating point - float, double
	 * 
	 * Character - char
	 * 
	 * Boolean - boolean
	 * 
	 * */
	
			/** Integer can represent in 4 flavour- 
			 * 
			 * 1.Binary - 0 and 1 (base 2)  use prefix- oB
			 * 
			 * 2.Octal - 0-7(base 8),      use prefix- 0
			 * 
			 * 3.decimal - 0-9 (base 10)  
			 * 
			 * 4.Hexadecimal - 0-9 A-F (16 digit)base-16 , use prefix- 0X
			 * 
			 * */

		//Rules for underscore-
		/*
		 * 1. can't start with underscore.
		 * 2. can't use underscore after prefix except octal
		 * 3.can't use underscore before and after L
		 */


// Interview questions

		/* 1. long a= 0_100_267_760;   correct (underscore allowed in octal)
		 * 
		 * 2. long b= 0_x_4_13;     invalid (underscore allowed in hexa prefix)
		 * 
		 * 3. long c = 0x1_0000_10;   valid
		 * 
		 * 4.long d= 100_12_12 correct
		 * 
		 * */
		 