package exception;


//public class Throwable extends Object implements Serializable

/*1. The Throwable class is the superclass of all errors and exceptions in the Java language. */


	//Constructor

/*			Throwable()
					Constructs a new throwable with null as its detail message.
					
			Throwable(String message)
					Constructs a new throwable with the specified detail message.
					
					
			Throwable(String message, Throwable cause)
					Constructs a new throwable with the specified detail message and cause.
					
					
			Throwable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
					Constructs a new throwable with the specified detail message,
					
					
			Throwable(Throwable cause)	
			      Constructs a new throwable with the specified cause and a detail message 
*/	


// Methods

/*Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait*/



/*
void addSuppressed(Throwable exception)
Appends the specified exception to the exceptions that were suppressed in order to deliver this exception.


Throwable  fillInStackTrace()
Fills in the execution stack trace.   


Throwable	getCause()
Returns the cause of this throwable or null if the cause is nonexistent or unknown.


String	getLocalizedMessage()
Creates a localized description of this throwable.


String	getMessage()
Returns the detail message string of this throwable.


StackTraceElement[]	getStackTrace()
Provides programmatic access to the stack trace information printed by printStackTrace().


Throwable[]	getSuppressed()
Returns an array containing all of the exceptions that were suppressed, typically by the try-with-resources statement, in order to deliver this exception.


Throwable	initCause(Throwable cause)
Initializes the cause of this throwable to the specified value.


void	printStackTrace()
Prints this throwable and its backtrace to the standard error stream.


void	printStackTrace(PrintStream s)
Prints this throwable and its backtrace to the specified print stream.


void	printStackTrace(PrintWriter s)
Prints this throwable and its backtrace to the specified print writer.


void	setStackTrace(StackTraceElement[] stackTrace)
Sets the stack trace elements that will be returned by getStackTrace() and printed by printStackTrace() and related methods.


String	toString()
Returns a short description of this throwable.*/














