package exception;

public class E1_ExceptionFlowDiagram {

}


//           		  	 Object
/*							| 	
						Throwable[checked]
							|
							|                 [Throwable further divides errors in too category]
							|
				---------------------------------------------		
				|	                     		             |
	Exception[deal with programming mistakes]          Error [deals with system errors like StackOverFlowError]
				|
				|
		RuntimeException	[unchecked]	
				
				
*/				
				
				
// Exception---all exceptions derived from java.lang.Exception classes are checked exception,

// RUntimeException-- those which extends RuntimeException, these are known as unchecked exception in Java.





/*Checked Exception in Java is all those Exception which requires being catches and 
handled during compile time. If Compiler doesn’t see try or catch block handling a Checked Exception, 
it throws Compilation error.
*/








				
				