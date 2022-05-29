package javaInterviewModule.JavaBasicsmodule2;

public class A9_TypeConversion {

	public static void main(String[] args) {
		
		char ch=350;   // only within range of char [allowed ,beacuse in this case we are assigning const value to char]*/
		System.out.println(ch);
		
		int n=320;
		char c;
		/* c=n;  [not allowed , beacuse in this case we are assigning variable value to char, value of n can be changed ,it is var]*/
		
		final int a=321;
		char c1=a; // now, compiler know that a is final variable , it will not change
		
		
		
		byte b = 10;
		int i;
		i=b;
		
		
		int a1= 10;
		byte b1 ;
		/* b1=a1; */ // cannot convert from int to byte , because we are assigning a variable to byte , var can be changed
		
		byte b2=10; // allowed because 10 is const
		
	// java ko variable se dar lgta h 	
		
		
		
		
		int a3=520;
		byte b3;
		b3 = (byte)a3;  // a byte ki range se bda h , overflow ho rha 
		System.out.println("b3-"+b3);

		//interview
		/** jab hmm type conversion krte h and value range ke bahar jati h to java overflow handle krti h by using mod by 256(double of byte128)
		 * 
		 * 520/256= 8
		 * */
		
		
		
		int a4=32768;
		short b4;
		b4=(short)a4;  // a4 short ki range ke bahar h to java uski range ka double krke mod kregi no ko
						// i.e. 32767/65536 = 32757   it's mod is also out of range , then java push it into -32758 val
		
		
		int a5=10;
		long b5;
		b5=a5;
		
		
		long a6=10;
		int b6;
		b6= (int)a6; 
		
		
		/*long a = 2147483648;  ( cannot convert from int to byte) */   
		
		
	}
	
}

// Type Conversion

/* Conversion done by compiler 
 * 
 * x=y;  [agr x and y ki datatype different h to compiler type conversion krne ka try krega]
 * */

// Types
/**1. Implicit (automatically done by compiler)
	Rules
	1. values should be convertable
	2. R.H.S datatype  < L.H.S  datatype  [range wise less hona chaheye]
			int float has same byte in size but float is big in range

*/

/** 2.Explicit 
 * 
 * when prog to do conversion
 * jab hmm conversion krenge to loss of data hoga , but since prog want to java kuch nhi khegi
 * 
 
 * 
 * */

//Interview question--

/*
 * Is a long data type smaller than float - yes in range
 */

