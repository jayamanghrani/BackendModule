package oops;

//Without encapsulation 

 class Student {
	 int roll;
	 char gender;
	
	private float per;        // declare variables of a class  as private/protected
	
	
	public float getPer()
	{
		return per;
	}
	public void setPer(float per)
	{
		this.per = per;
	}	
}
 
 
 class UseStudent
 { 	public static void main(String[] args)
 	{
	Student s = new Student();
	s.roll=10;     // Although this syntactically correct but voilating rule of encapsulation 
	s.gender='A';
	/** s.per=75.6f; ---- the field Student.per is not visible*/
	 
	s.setPer(75.6f);
	System.out.println(s.getPer()); 
	
 	}
	 
 }
 

 
 
 


// Accroding to Encapsulation ,
 
// Encapsulation is to hide our data in order to make it safe from any modification
 
 // Ex. PI is public , Math class ka data member h but we can't modify it because it is final
 
/*we should use access modifiers to allow access to all methods, but not any instance variables.
 * declare all variables of a class  as private/protected
 * define public  method in class to modify and view the variable values.
 * 
 * */
 
 /** And provide setter and getter to operate on these members.
 * getter is also known as - accessor
 * setter - mutator
 * 
 */ 

 
 

//advantages of using Encapsulation
/* data security
 * 1. Encapsulation in Java allows you to control who can access what. (provide flexibility)
 * 
2. Encapsulation in Java makes unit testing easy.[we can test small small part using setter and getter]

3.	The fields can be made read-only (class se setter nhi diya to change nhi kr sakte , phir bn jayega read only)

4. Encapsulation in Java is achieved using access modifiers private, protected, and public.


4. Factory pattern, Singleton pattern in Java makes good use of Encapsulation.*/
 
 
 
 
 
 
 
 
 
 