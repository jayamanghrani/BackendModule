package designPatterns;

public class A1_SingletonDesignPattern {

}


//Singleton is a class which has only one instance in whole application 
//and provides a getInstance() method to access the singleton instance.


/*There are many classes in JDK which is implemented using Singleton pattern 
like java.lang.Runtime which provides getRuntime() method to get access of it
and used to get free memory and total memory in Java.
*/

//To design a singleton class:

/*1. create a static reference and initialize it will null
 * 1.Make constructor as private.
 * 2. Write a static method that has return type-> object of this singleton class.

*/
		
