package designPatterns;

import java.util.logging.Level;
import java.util.logging.Logger;

//Are there examples of the Singleton pattern been used in some framework or library? Yes. Let us review some.

//Logger is a Singleton and the method getLogger() provides access to the Logger instance.


public class A2_SingletonLoggerExample {

	
	public static void main(String[] args) {
		
		 // Create a Logger with class name
		
		Logger logger = Logger.getLogger(A2_SingletonLoggerExample.class.getName()); 		
		logger.info("Hello");
		logger.info("This is logger class , will return logger ka obj or if already created then return the same obj");		
		logger.warning("bye");
	}
}

