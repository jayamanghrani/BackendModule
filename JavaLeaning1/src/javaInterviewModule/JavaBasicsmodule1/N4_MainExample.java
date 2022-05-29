package javaInterviewModule.JavaBasicsmodule1;

public class N4_MainExample {

	
	
	static
	{
		System.out.println("static block called");
	}
	
	
}
/*
 * this code will compile but will not run Error: Main method not found in class
 * javaInterviewModule.module1.N4_MainExample, please define the main method as:
 */


// ye code java6 tak chlta tha , from java 7 onwards , JVM check the presence of main




//Execution order of the Main class

/*
 * 1. Start JVM
 * 2. Create and start main thread 
 * 3. Locale the .class file which has to be executed
 * 4. check for main() method 
 * 5. Load the Main class and execute initialization of any static variables and static block
 * 6. call and execute the main method
 * 7.terminate the main thread
 * 8. Unload the class
 * 9.shutdown the JVM
 */