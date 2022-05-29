package javaInterviewModule.OOPSmodule3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


// creating obj using contructor is more powerful than creating obj using class

class Person1
{
	private int age;
	private String name;
	
	static
	{
		System.out.println("static block executed");
	}
	
	public Person1(int age, String name)
	{
		System.out.println(" creating obj for person class");
		this.age=age;
		this.name=name;
		System.out.println(this.name.charAt(10));// ArrayIndexOutOfBoundException ---InvocationTargetException
		
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


public class A4_ObjectUsingConstructorClass {

	public static void main(String[] args) {
		
		System.out.println(Person1.class);
		
		try
		{
			/* Constructor c = Person1.class.getConstructor(); */
			
			
			// noSuchMethodFoundEcxeption
			/*
			 * getContructor reflection use krke check krega ki hmari class me kitne
			 * constructor h since hmari class me non-parameterized constructor nhi h to
			 * error aayegi
			 */
			
			
			Constructor c = Person1.class.getConstructor(int.class,String.class);
			
			
			//Person1 p= (Person1)c.newInstance(1.5);   -->IllegalArgumentException
			
			
			  Person1 p= (Person1)c.newInstance(15, "Anil");  

			System.out.println(p.getAge()+" "+p.getName());
					
		}
		
		catch(NoSuchMethodException ex)
		{
			System.out.println("can not find the class "+ex);
		}
		catch(InvocationTargetException ex)
		{
			System.out.println("Target generated exception i.e. exception in constructor-- "+ex);
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
