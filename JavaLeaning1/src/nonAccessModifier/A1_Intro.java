package nonAccessModifier;

public class A1_Intro {

}

// Non Access Modifier - change the functionality of a variable or method or class

//Why we call them Non-access modifier?
/*
 * They don't control visibility/accesibility, it change the default properties of class sand
 * its member.
 * 
 * 
 * ex.1 by default class instantiable hoti h , obj bna sakte but abstract can change its property
 * 
 * ex 2  by default class inheritable hoti h , but using final we can change this property
 * 
 * 
 */
/*
1. abstract- class , methods , interface(by default)

		( class -ke sath lgta h to class ka obj nhi bn sakta. agr kiya to syntax error
		  methods - if class has 1 abstract method , then the class will be abstract, class can contain abstract and non abstract method both.
	

2.  static - class, global data(class variable), methods, block , interface
			[In case of data - common copy for all obj , in case of method- can call without object]

	static final dost h .


3.  final -class, data(local and global) , methods


4. synchronized --threads ko mutually exclusive 


5. native - when java code interact with C language,  eski body kahi aor di gyi h ,
 to use native we have to use JNI(java native interface) technology.
 
 		Native is a java method whose implementation written in other lang.
 		
 		Benefits:-
 		1. we can use functionality of other lang also.
 		2. speed
 		3. native can be used with method only.
 		
 		


6. strictfp - restrict floating pt calculation


7. transient - object ko jab file me save krte h , and agr hmm chahte h ki kuch data file me save na ho


8.  volatile- Multithreading me use krte h , java guarantees that the value of the volatile variable 
			will always be read from main memory and not from Thread's local cache


*/