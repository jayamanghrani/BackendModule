package javaInterviewModule.OOPSmodule3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class A5_ExceptionInObjCreation {

}


//Interview questions---   ExceptionInObjCreation


//1. ClassNotFoundException
				/*- when class could not found on def classpath.*/


//2. IllegalAccessException
				/*- when constructor is private.*/

//3.IllegalArgumentException 
				/* when argument passed don't match with the const */

//4.NoSuchMethodException
				/* when a class has different constructor */
				
//5. InstantiationException - 
				/* When a class is abstract or interface, which can't instantiate or we use newInstance() of class Class with wrong constructors */
				
//6 InvocationTargetException
				/* When a constructor of class throws some exception */


/*
	 * public T newInstance() throws InstantiationException, IllegalAccessException{}
	 * 
	 * 
	 *   public T newInstance(Object ... initargs)throws InstantiationException, IllegalAccessException,
               IllegalArgumentException, InvocationTargetException
     *	 
	 * 
	 * public static Class<?> forName(String className)throws ClassNotFoundException {}
	 * 
	 * public Constructor<T> getConstructor(Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException {
	 * 
 */
				