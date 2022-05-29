package nonAccessModifier;

//An abstract class is something which is incomplete and you can not create an instance of the abstract class. If you want to use it you need to make it complete or concrete by extending it.

abstract class Person
{
private String name;
public void displayName()
{ 
}
public abstract void perform(int a); // abstract methods can be parameterized


}

//Important point 

//By the way, Java has a concept of abstract classes, abstract method but a variable can not be abstract in Java.
/*1. If class contains abstract method h , then class must be declared as abstract but vice versa is not true.
2. If class is abstract ,that doesn't mean ki uske method bhi abstract ho ,
	agar 1 bhi method abstract nhi h to bhi class abstract ho sakti h.
	
3. abstract classes override hoti h 

4. abstract class can contain constructor

5. can conatin setter getter

6. Interface are bydefault abstract in java
*/


interface Movable{} // by default abstract
abstract interface Movable1{} // we can write like this also



