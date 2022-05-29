package nonAccessModifier;

public class A5_StaticClassExample {

	private String brand;
	private static String count;	
	public static final int MIN_AGE=20;  //static and  final can come together
	
	
	static{
		
		String s= "This is my static block";
		System.out.println(s);
		System.out.println("Min Age is -"+MIN_AGE);
	
	}
	
	
	public static void display()
	{
		System.out.println("This is my static mthod , calling without creating obj");
	}
	
	
	
	public static void main(String[] args) {
		
		//static method can not acess non static
		/*System.out.println(brand);*/ 

		
		A5_StaticClassExample.display();
		
	}	
}


//Static variable
/*static variable in Java belong to whole Class than individual Object.
 common/shared to all instances of a class.
 * declared at class level.
 * static variable are called by class name, it is also called class member.
 * if we access static variable by obj name  then java replace it by class name.
 *  
 *  
 *  Static fields are initialized at the time of class loading in Java,
 *  
 *   In other word one static variable is shared between all object in Java,
 *    which means in a multi-threading environment access to static variable must be synchronized
 *     other wise you will get unexpected behavior. 
 */


//Static Methods

/*can call by classname.
 * ex;-Math.PI , Collections.sort
 * 
can't access non static data

If method is working only on its arguments and not accessing any non static data , then made that method static.
We can create static method in utility class


this and super is not allowed in static , beacuse they belong to obj.


Static method can not be overridden in Java as they belong to class and not to object.

*/



//Can a class be static in Java?

/*Inner classes can be Static
 * Inner classes that are declared static are called static nested classes.

A static class can access only the static members of the outer class.
A static nested class may be instantiated without instantiating its outer class.

Normally we make a class static in Java when we want a single resource to be shared between all instances 
and normally we do this for utility classes.



*/


