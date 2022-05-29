package javaInterviewModule.StringCodingModule;

public class B10_StringFormatting {

	public static void main(String[] args) {
		
		System.out.println(String.format ( "%,6.2f", 124.000));
	}
}


/*Prior to Java 5 java programmer relies on java.text API for all their formatting need 
but with Java 5 we have now two more convenient ways to format String in Java.
		JDK 1.5 has added format() method in java.lang.String class and
		provided a printf() method in PrintStream class for printing formatted output in the console.*/


//How String.format()or printf()works in Java

	//String.format( "%[argument number] [flags] [width] [.precision] type"  )


/*1. "%" is a special character in formatted String and it denotes the start of formatting instruction.

2."flags" is another special formatting instruction that is used to print String in some specific format 
for example you can use the flag as "," to print comma on output. 

3. "width" formatting option denotes minimum number or character will be used in output

4.The "precision" is using for print floating point formatted 
*/

//format ( "%,6.2f", 124.000)
/*In the above example of  String.format() method flag is a comma ",",
width is 6 and precision is up to 2 decimal point and type is a float.*/