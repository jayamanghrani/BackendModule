package javaInterviewModule.ExceptionModule4;


public class A8_Errors {

	public static void main(String[] args) {
		
		try
		{
		display();	
		}
		catch(StackOverflowError e)
		{
			System.out.println(e);
		}
		
		
		
		
	}
	public static void display()
	{
		System.out.println("Hello");
		display();
	}
	
	
}

//Error
/*An error is a serious exception thrown by the JVM.  
*/ 
//For example, 

/**NoClassDefFoundError */
/*
 * which is an error thrown by the JVM when it’s unable to locate the .class
 * file that it’s supposed to run.
 * 
 * 
 * This error is thrown when the Java Virtual Machine (JVM) tries to load the definition of a class,
 *  but the definition could not be found. 


The definition of a class can be requested during a method call,
 or while creating a new instance using a new keyword.
 
 */

  
  /**Another error is StackOverflowError */
/*  which occurs when the size of the memory required by the stack of a Java program
 *  is greater than what the JRE has offered for the Java application, 
 *  for example an infinite recursive code.
 *  
 *  
 *   * This error is thrown by the JVM when a Java program calls itself 
 * so many times that the memory stack allocated to execute the Java program “overflows.”
 *  
 *  
 */



//An error can be caught by an exception handler, but it shouldn’t be.
// because for that errors- we can't do anything from program end



//NoClassDefFoundError V/s ClassNotFoundException


/**
 * NoClassDefFoundError 					| ClassNotFoundException*/
/*											|
  unchecked 								|		checked											|
 .class nhi milti							|     class nhi milti 
System.out.println(Person.class);			|	Class c = Class.forName("javaInterviewModule.module3.Person");
and person.class koi delete kr de 			|			when class dynamically supply krte h 
after code compilation and before code execution|					|
 */
