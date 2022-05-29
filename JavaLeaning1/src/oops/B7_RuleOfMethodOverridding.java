package oops;

public class B7_RuleOfMethodOverridding {

	public void show()
	{
		
		int a= (int)Math.random();
		if(a==0)
		{
			throw new ArithmeticException();
		}
		
	}
	
}


class DerivedClass extends A
{
	@Override
	public void show()                               
	{
		
		int a= (int)Math.random();
		if(a==0)
		{
			throw new NumberFormatException();          // Rule 6
		}	
	}
}




// Rules of Method Overridding:


//1
/*1. While overridding a super class method in sub class, the signature(name , arguments) must be same.
 * */


//2
/*2. Return type must either be same or can be any sub type of the type returned by super class method.
	For ex. 
			(Assuming Vehicle as parent class and Car as a child class of Vehicle class).
			If the parent class method returns Vehicle then Subclass’s overridden method’s return type
			 can be any subclass of Vehicle class, for example,
			 Car can be a return type of overridden method in child class. 
			 
			 //This is called "CO VARAIANT" return type
			  
*/					 

//3
/*. Access modifier must be either same or less restrictive
 * 
 * E.g. If the parent class method has a protected access modifier then 
 * the child class overridden method cannot have a private access modifier, but the public is allowed.
 * 
 * */


//4. 
/*	 Use @override annotation for the overridden method, 
	so if we don’t follow the overriding rules then the compiler will show the error.
	
	
	sub class can override only those methods , which are visible to it. 
	For ex. 
		In a sub class we can override every method except private and final.	
	
*/


//5. 
/*Sub class outside the package can only override protected and public methods 
because rest others are not visible in sub class
*/

// exception handling Rule

	//6. Unchecked exception
	
	/** throw */
	/*A subclass method while overridiing a super class method can throw any type of unchecked exception
	irrespective of whether the super class is throwing or not.*/
	
	/** throws */
	/* parent -> public void m1() throws NullPointerException 
	 * 
	 * 
	 * NullPointerException is unchecked , which is ignorable ,
	 *  because unchecked exception throws ke sath lgane ka koi sense hi nhi rehta
	 * 
	 * 
	 * child -> public void m1() 
	 * 
	 * 
	 * */




//7 For checked exception , multiple rules


	/** throws */



	//a)
/*		We can use throws clause while overriding the method 
		and keep the same checked exception as thrown by the super class method.
		
		As we do in while overriding doGet(), doPost()  (throws ServletException, IOException)
*/


	//b)
/*	 We can throws only same or subtype of that exception thrown by super class
	 
	 Ex. super class- throws IOException
	 in sub class - we can mention throws IOException
	  in sub class - we can totally eliminate the throws clause in child
	  in sub class - we can mention FileNotFound (because it is sub type of IOException)
	  				But why only subtype??
	  				
	  				
	  				
	  	Esa esliye agr hmne subtype lgaya to code ek hi type ka catch lgayenge to chl jayega code 
	  	
	  	otherwise bohot sare catch lgane pdenge
	  	 
	  	 
	  	 catch(IOException)  -----it can handle sub types , but can't handle other than sub type
	  	 {
	  	 }
	  	 
	  	 agar esa rule nhi hota , to bohot sare catch lgenege	  	 	  	 
	  	 
*/	

	 //c)
		/*	if while overriding we want then we can totally eliminate the throws clause in child */
	 


	 
//8. 
/*	We cannot override static methods, rather we hide them.
 * . Static methods can’t be overridden, only instance methods are overridden.
*/	
	 
//9
/* A subclass can use super.methodName() to call the superclass version of an overridden method.
 *  
 * but remember we can't use -super.super.methodname()
*/	 
	 
	 


