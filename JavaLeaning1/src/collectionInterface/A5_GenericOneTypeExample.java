package collectionInterface;

public class A5_GenericOneTypeExample<T> {
	
	
	//Generics mean parameterized types
	//The idea is to allow type (Integer, String, … etc, and user-defined types) 
	//to be in parameter to methods, classes, and interfaces.
	//Note: In Parameter type we can not use primitives like  'int','char' or 'double'.

	T obj;
	
	A5_GenericOneTypeExample(T obj)
	{
		this.obj=obj;
	}
	
	public T getTObj()
	{
		return obj;
	}
	
	
	public static void main(String[] args)
	{
/*		For Wrapper and String class , obj can be create without new
		 Integer obj=15 
		   or
		  Integer obj= new Integer(15);  both are same
		  
		  */
		
		A5_GenericOneTypeExample<Integer> iobj= new A5_GenericOneTypeExample<Integer>(15);		
		System.out.println(iobj.getTObj());
		
		A5_GenericOneTypeExample<String> Sobj= new A5_GenericOneTypeExample<String>("String obj can be create without new");
		System.out.println(Sobj.getTObj());
		
//		iobj=Sobj;//This results an error
		
		//Even though iObj and sObj are of type Test, they are the references to different types because their type parameters differ.
		//Generics add type safety through this and prevent errors.
		
//	     GenericOneTypeExample<int> intobj= new GenericOneTypeExample<int>(15); // COMPILE TIME ERROR
		
		
	}
	
	
}




/*Advantage of Generic
2. Type Safety: Generics make errors to appear at compile time rather than at run time
(It’s always better to know problems in your code at compile time rather than making your 
code fail at run time). 
	If we will not use Generic type?
		Suppose you want to create an ArrayList that store name of students and if by mistake programmer 
		adds an integer object instead of a string, the compiler allows it. But, when we retrieve this data
		from ArrayList, it causes problems at runtime.*/
