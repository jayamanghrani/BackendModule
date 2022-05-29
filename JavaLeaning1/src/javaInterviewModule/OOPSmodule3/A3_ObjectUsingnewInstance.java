package javaInterviewModule.OOPSmodule3;

 class Person
{
	private int age;
	private String name;
	
	static
	{
		System.out.println("static block executed");
	}
	
	public  Person()
	{
		System.out.println("object created for person class");
		age=24;
		name="Amit";
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}


public class A3_ObjectUsingnewInstance {

	public static void main(String[] args) {
		
		System.out.println(String.class);
		System.out.println(Integer.class);
		System.out.println(Class.class);
		System.out.println(int.class); 
		
		
		try
		{
			Class c = Class.forName("javaInterviewModule.module3.Person"); //since our person class is inside package , we will have to fully qualified name
			
			/* Also we can use */
			/* Class c1 =Person.class;   in this way we don't have to give fullyqualifiedname*/
	
			/* diff blw them is -- Person.class krne se class load nhi hogi */
			
			
			  Person p= (Person)c.newInstance(); 

			System.out.println(p.getAge()+" "+p.getName());
					
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("can not find the class "+ex);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("Wrong argument "+ex);
		}
		catch(IllegalAccessException ex)
		{
			System.out.println("cannot access the class due to private constructor -"+ex);
		}
		catch(InstantiationException ex)
		{
			System.out.println("cannot create obj, because class is abstract -"+ex);
		}
	}
	
}


// How to create obj using newInstance() method of the class Class?

/*Steps:
	1.Link our class with the obj of class Class.
	2. call method newInstance() of the class obj.
	
	
	Ex;
	Class c = Class.forName("Person");  -- c will store details of person class
					Or
	Class c = Person.class;				
	
	
	2) Person p =(Person).newInstance
	  
	  But person class should have non-parameterizes constructor
	
	Then we will call newInstance method
	
	public Object newInstance() throws IllegalAccessException, IllegalArgumentException,InstantiationException
	{.....}
	

*/	


// IllegalAccessException

/*
 * When we will call newInstance() method , it will create obj of our class and
 * will call our constructor, and if our constructor is private then exception illegalAccess
 */

// IllegalArgumentException




// InstantiationException

