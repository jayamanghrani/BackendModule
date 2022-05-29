package oops;

public class A9_Inheritance {

}

//Inheritance is the easiest way to reuse already written and tested code
/*Inheritance is an Object oriented feature which allows a class to inherit behavior and data from other class.
*/
//Inheritance is actually meant for code reuse. A child can reuse all the codes written in Parent class, and only write code for behavior that is different than the parent. 



//Benefits of Java
/*
 * Reusability 
 * Reduced code redundancy
 */




//Java supports

/*1. Multilevel inheritance
2.Single inheritance
3.Hierarchial inheritance
*/


//Java doesn't supports

/*Hybrid inheritance
Multiple inheritance
*/



//Importanat points about inheritance

/*2)  Inheritance in Java is supported using extends and 
implements keyword, extends keyword is used to inherit from another Java Class and
 allow to reuse functionality of Parent class. While implements keyword is used to implement Interface in Java. 



3)If you do not want to allow Inheritance for your class than you can make it final.
  final classes can not be extended in Java and any attempt to inherit final class will 
  result in compile time error.(Ex. String class in java is final)


4)Constructor in Java are not inherited by Sub Class.
since in subclasses it has a different name (the name of the subclass).And The constructor name is identical to the class name.

5) Inheritance in Java represents IS-A relationship.
(Sub Class IS-A Super class) like Mango IS-A Fruit.
 If you see IS-A relationship between your domain Objects and Classes than consider using Inheritance

6)Private members of Super class is not visible to Sub class even after using Inheritance in Java.


------------------------------------------------------------------------------


*/

//Interestingly, Inheritance facilitate Polymorphism in Java. 

/*1)
 * 
 *  By using Inheritance Sub class gets all property of Superclass, except private,
   and can represent Superclass i.e. you can store subclass instance in a Superclass reference variable,
    which is a form of Polymorphism in Java. 
 *  
 *  Super class reference variable can point to Sub Class Object e.g.

//Base class = superclass
//derived class = sub class



SuperClass parent = new SubClass();

is legal at compile time because of IS-A relationship between Super class and Sub Class.
In Java (Sub Class IS-A Super class) like Mango IS-A Fruit.

*---------------------------------------------------------------------------------------------
2) (overloading and overridding) polymorphism concept can be use in inheritance

 Overloading is related to compile-time (or static) polymorphism.
 
  overriding is an example of run time polymorphism

----------------------------------------------------------------------------------------------

 3)Use @Override annotation while overriding super class's method in subclass.
 This will ensure a compile time check on whether overriding method actually overrides super class method or not. */




