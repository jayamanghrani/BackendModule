package oops;

public class B6_MethodOverloadingAndOverridding {

}
// Method overloading and method overriding are based on Polymorphism in Java.

//Java allows you to create two methods of the same name by using method overloading and method overriding.

//Also, rules of overriding or overloading a method are different in Java.

//For example, a private, static and final method cannot be overridden in Java but you can still overload them. 

/*
difference between them is that call to overloaded methods are resolved using static binding/compile time
while the call to an overridden method is resolved using dynamic binding/run time in Java.
*/



//Method Overloading Rule in java

/*1. Method overloading means two or more methods in a class having the same name 
	but different parameters(arguments).
	
2. Methods may or may not have a different return type.
		
3. Method overloading reduces duplicate code and allows us to
	use the same method name for different purposes.
	
4. Method overloading is also called Compile time polymorphism because
, at the time of compiling the code, the compiler decides which method 
is going to be called based on the method name, return type, and arguments.
		
5. Overloading can also happen in the case of inheritance.
This is because the Child class already has one version of inherited methods 
from the parent class and can also write another overloaded version of that method.


*/
