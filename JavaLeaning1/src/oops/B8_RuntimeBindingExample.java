package oops;

class A1
{
	
private void show()                    // private method , will not visible to other classes
{
	System.out.println("Show of A1");

}

}

class B1 extends A1 
{
	
	public void show()                      // we are not overriding since we haven't applied override annotation here 
	{
		System.out.println("Show of B1");

	}


}

class B8_RuntimeBindingExample
{
	public static void main(String[] args) {
		

	A1 obj = new B1();  // we are doing polymorphism
	
	
	
//	obj.show();   error  why?
	
/*	
	We have created instance of A, and it is refering to object of B. and B have show method , it should called 
	according to runtime/dynamic/late binding.
	*/
	//Answer

/*	Run time binding decide by JVM  and JVM run after compilation.
	
	This code will fail at compilation 
	
	because A don't know that obj.show() will called to B method , use abhi bhi ye lag rha  ki A ka method call ho rha h
	and A ka show method private h, esliye error aa rha
	*/
	
	// There is a one way by which we can run our code  i.e. By Type casting

	((B1)obj).show(); // compiler ko visvas ho jaye ki ye obj B1 ka h 
	
	}
	
}



//Binding

/* connectivity b/w a method call and method body
* 
*  obj.show()  kiska show chlega ??
*  
*  depends on binding or  obj kisko point kr rha h 
*  
*  
*  */

/**
 * Compile time Binding 
 * 
 * 
 * 
 * 
 * Static Binding 
 * 
 * 
 * 
 * 
 * Run time binding
 */


