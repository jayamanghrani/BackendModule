package designPatterns;

public class A8_BuilderDesignPattern {

}

//What problem Builder pattern solves in Java
/*its solves problem related to object creation.*/

/*Constructors in Java are used to create objects and can take the parameters required to create objects.
The problem starts when an Object can be created with lot of parameters, some of them may be mandatory
and others may be optional. 
*/


/*Consider a class that is used to create Cake, now you need a number of items 
like egg, milk, flour to create cake. many of them are mandatory and some  of them are optional 
like cherry, fruits etc. 
				If we are going to have overloaded constructor for a different kind of cake 
				then there will be many constructors 
*/	


/*Problems:
	1) too many constructors to maintain.
	2) error occur because many fields has same type e.g. sugar and and butter are in cups
		so instead of 2 cup sugar if you pass 2 cup butter,
		your compiler will not complain but will get a buttery cake with almost no sugar
		with high cost of wasting butter.

*/

//Solution--
/*Builder pattern reduces chance of error by adding ingredients explicitly 
and making object available once fully constructed. 
*/


// Guidelines for Builder design pattern in Java
/*
1) Make a static nested class called Builder inside the class whose object will be build by Builder.
	In this example its Cake.	
2) Builder class will have exactly same set of fields as original class.	
3)  Builder class will expose method for adding ingredients 
4) Builder.build() method  will return fully build object
*/


//When to use Builder Design pattern in Java
/*Builder Design pattern is a creational pattern and should be used 
when a number of parameters required in the constructor is more than manageable usually 4 or at most 5. 

*/


//Advantages:
/*1) more maintainable if the number of fields required to create an object is more than 4 or 5.
2) less error-prone as users will know what they are passing because of the explicit method call.
3) more robust as only fully constructed object will be available to the client.*/

//Disadvantages:
/*1) code duplication as Builder needs to copy all fields from Original class.
*/





