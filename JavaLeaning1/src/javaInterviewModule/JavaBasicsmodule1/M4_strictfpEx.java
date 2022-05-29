package javaInterviewModule.JavaBasicsmodule1;

strictfp public class M4_strictfpEx {

	
	public static void main(String[] args) {
		
		double MAX = Double.MAX_VALUE;
		System.out.println(MAX-1);
	}
	
}


//can main method be strictfp --yes 

//strictfp

/*
 * In java , floating point representation and computation are platform
 * dependent. This means that when a class file is run on diff platform(32/64
 * bit processors) then the output might vary.
 */

/*
 * To solve this types of issues , the strictfp keyword was introduced in JDK1.2
 * 
 * strictfp modifier ensures that all the floating pt operations across diff JVMs and platform
 * will provide same result.
 */



//Where can we use strictfp

/*
* class --all code in the class will use strictfp computations.
* method -- all code within method will use strictfp computation
* interface --all class that implements the interface will use strictfp
*/


//where we can't use strictfp
/* constructor 
* with abstract methods
* 
* */
