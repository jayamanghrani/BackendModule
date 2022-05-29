package javaInterviewModule.java8Features;

public interface A3_StaticMethodInInterface
{

	static public void myMethod()
	{
		
	}
	
	
}


// We can declare static method , so that we can fix our implementation ,
//earlier before static method  we use clasess example utility clasees Math, Arrays

/*
 * Interface ke static method , vo obj ka part nhi hote , we can't call it from object.
 * 
 *  A3_StaticMethodInInterface.myMethod()
 */

/**
 * same happens with class we call static method by using class name.
 * 
 * If we write obj.staticmethod java compiler internally convert obj into Classname.
 * 
 * But this happens with class name only
 */