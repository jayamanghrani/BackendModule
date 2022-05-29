package javaInterviewModule.OOPSmodule3;

public class A2_DiffrentWayOfObjectCreation {

}

//There are multiple ways to create Objects in Java 



 // Three ways by calling constructor-

 	// 1. new keyword---
 	/* 				 most common and easy way to create Object in Java */



	// enka use framework level pe jada hota h
	// Below 2 are called Reflection , but 3rd is more powerful , beacuse it takes parameterized constructor*/
	/* * 
	* 2. Using newInstance() method of class java.lang.Class.---------Hibernate , Spring framework use this
	* 
	* 3. Using Constructor class - java.lang.reflect.Constructor
	*/ 
	 /** These two internally use new to create object , then what is the use of this way.When to use this?*/
	/*
	 *  a) When have to create obj at runtime based on cond 
	 *  For ex- WAP to take class name from user and create its obj (A6_ObjectOnDemand.java)
	 * 
	 * b) Help us to implement Factory design pattern
	 * 
	 * c) many framework spring, hibernate use this to create object
	 */

// Without constructor
	/*
	 * 4.Using clone() method of Object class 5.Deserialization 6.You can also use
	 * Factory methods to creates Objects in Java, and best suited to create
	 * instance of Immutable classes
	 */




// What happens in Memory when an obj is created--

	/*
	 * 1. new allocate space in memory 
	 * 2. provide default value to variables
	 * 3. call constructor
	 * 4. initialize value of variable in constructor 
	 * 5. finally returns address of the object which gets stored in the reference
	 * 
	 */


// Java have 4 type type of reference
/*
 * strong weak fantom ....
 */