package oops;

import java.io.Serializable;
import java.util.concurrent.Callable;

 abstract interface Printable extends Serializable, Callable {   //interface can extends multiple interface


//Variables in interface
	 
	 public static final int printpages=5;  
	 
	/* int amount1;*/ // error(we have not initializd)
	 
	 
	 int amount=10; //public & static and final being automatically inserted by compiler
	 

// getter,setter and constructor can't be applied in interface	 
	
	 
	 
//default method
	 default void print()
	 {
		 System.out.println("printing");
	 }
	 
	 default void print2D()
	 {
		 System.out.println("printing 2D...");
	 }
	 
	 
 //static method
	 
	 static void print3()
	 {
		 System.out.println("printing in static method");
	 }
	 
	  
	 
 //abstract method
	 
	 void print3D();
	 

// if a method has body in interface, must be marked as default or static explicitly  otherwise error
/*	 public int pages()      
	 {
		 return 13;
	 }
*/	 
	 
	 
	 
}


//Interface in java is a core part of the Java programming language & one of the ways to achieve abstraction in Java 


/*
 1. The interface in java is declared using a keyword interface
 
 2.by default interfaces are abstract 
 
 	ex :  abstact interface Book  === interface Book
 	
 		If we not not write abstarct java will automatically assume*/
 

//Variables in Interface

/* 3) All variables declared inside interface is implicitly public static final variable or constants.*/


		// Before java 5 ---
	 
	 /*   a) Interface was useful for declaring Constants.
	      
	      b)advantage of using Interface was that you can implement interface 
	        and can directly access constants without referring them with class name. 
	 */
	 
	    //After java 5 ---
	
	/* 	    a) Though after introduction of static imports in Java 5 
	 		b) this approach(using constant in interface) doesn't offer any benefit
	 
	 */
 		
 
// Methods in Interface

/*1) Prior to java 8 --->All methods declared inside Java Interfaces are implicitly public and abstract,
even if you don't use public or abstract keyword.

2) Since java 8 includes default and static method, and they can never be abstract.

3) Methods are assumed to be abstract if not marked as default or static.

4)A static method defined in an interface is not inherit in any class that implements the interface

5) Now we can't assume the abstarct modifier will be implicity added to all methods by compiler

*/

 //What is the Use of Interface in Java and Object Oriented Programming? 
 
 
 
/* You will learn more about interfaces when you start using design patterns.
 many design patterns like decorator pattern, Factory method pattern or Observer design pattern
 makes very good use of Java interfaces.*/


 /*Since multiple inheritances are not allowed in Java, 
 the interface is the only way to implement multiple inheritances at the Type level.*/
 
 
/* @Override annotation can be used on interface method from Java 6 onwards,
 *  so always try to use it. Its one of those coding practice which should be in your code review checklist.*/
 
 
 
/* 
 http://bytepadding.com/java/java-core/how-java-8-default-method-ambiguity-solved/
*/ 
