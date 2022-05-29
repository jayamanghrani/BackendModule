package javaInterviewModule.JavaBasicsmodule1;

public class N1_MainExample {

	public static void main(String[] args) {
		
		System.out.println("parent main called");
	}
	
	
	public void show()
	{
		System.out.println("show of class");
	}
}

class F extends N1_MainExample
{
	
	/* public void main(String[] args) */             //method name is main , so that means we are doing overriding/hiding
	/* { 											 //so while overriding we can't remove static keyword		
	 System.out.println("parent main called"); 
	 } */

	
	
	/* public static void show() */       //overriden method is static
	/*
	 * { System.out.println("show of class"); }
	 */

}