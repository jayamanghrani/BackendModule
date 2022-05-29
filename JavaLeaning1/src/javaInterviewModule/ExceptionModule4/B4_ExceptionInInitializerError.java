package javaInterviewModule.ExceptionModule4;

public class B4_ExceptionInInitializerError 
{
		
	 static{
         //int n=Integer.parseInt("a");   // NumberFormatException
 	    }
	// But initializer block will throw ExceptionInitializerError
	 
	 
	 
	 //ExceptionInitializerError
	 static{
			 String name = null; 
			 int nameLength = name.length();  // NullPointerException
    	    }

	 
	 
	 public static void main(String[] args)
	 {
		
	}
	 
}


/** The ExceptionInInitializerError  */
/*
 * is typically thrown by the JVM when a static initializer in your code throws
 * any type of RuntimeException.
 */