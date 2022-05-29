package javaInterviewModule.ExceptionModule4;

class Course
{ 
String courseName; 
	Course()
	{ 
	Course c = new Course();           // recursive , Exception in thread "main" java.lang.StackOverflowError
	c.courseName = "Oracle"; 
	} 
} 



public class B7_InterviewQuestion {

	public static void main(String args[]) { 
		Course c = new Course();             
		c.courseName = "Java"; 
		System.out.println(c.courseName); 
		} 

}


//1 Select the correct option(s):

/*
 * A. You cannot handle runtime exceptions.
 * B. You should not handle Error. 
 * C.If a method throws a checked exception, it must be either handled by the
 * method or specified in it’s throws clause. 
 * D. If a method throws a runtime exception, it may include the exception in its throws clause.
 * E. Runtime exceptions are checked exceptions.
 * 
 * Answer: B,C,D
 */


//2 Select the incorrect statement(s):

/*A. java.lang.Throwable is the base class of all type of exceptions.
B. If a class is a subclass of java.lang.Exception, it may or may not be a checked exception.
C. Error is a checked exception.

D. Error and checked exceptions need not be part of a method signature.


Answer: C,D (Error is unchecked exception)
*/










