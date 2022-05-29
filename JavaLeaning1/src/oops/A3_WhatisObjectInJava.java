package oops;

public class A3_WhatisObjectInJava {
}


//What is Object?
/*
 * Suppose mobile is a object- 
 * attributes- name, colour, RAm, price
 * Functionality- call, msg
 * 
 * So , object contain attributes and functionality
 */

//There are multiple ways to create Objects in Java 
/*1. new keyword---but most common and easy way to create Object in Java
 * 2. Using newInstance() method of class Class.
 * 3. Using Constructor class
 * 4.Using clone() method of Object class
   5.Deserialization
   6.You can also use Factory methods to creates Objects in Java, and best suited to create instance of Immutable classes
*/

/*When we create an object of any class in Java,
its constructor gets called, which initialized object with its default or initial state. */


/*Objects are created at runtime when you start JVM with java command and 
JVM will start executing your code, whenever JVM encountered new keyword it will create an Object.*/



//Important points related to objects in Java

/*1) Classes which have just one Object or one instance in whole application are known as Singleton in Java.
It's tricky to create thread-safe Singleton in Java but they are very useful.
One example of Singleton in Java is java.lang.Runtime
*/


/*2) Objects can be serialized in Java by using Serialization process,
which stores state of Object into persistence e.g. file or database so that later in time, 
same Object can be recreated.*/


/*3) Java programming language provides mechanism which converts primitive data types
like int, long, double into respective Objects e.g. Integer, Long and Double
and this process is called Autoboxing in Java.
opposite of converting Object to primitive is known as Unboxing in Java.*/


/*4) variable which points to any instance or object in Java are known as reference variable

5) Java API also has a class called java.lang.Object in java.lang package which is Super class of all Java classes.
Every class in Java including System and user defined classes implicitly extends Objects,
if they don't extend any other class explicitly.


*/


