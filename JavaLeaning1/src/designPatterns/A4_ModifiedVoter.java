package designPatterns;

import java.util.logging.Logger;

public class A4_ModifiedVoter {


	private int age;
	private String name;
	
	Logger logger = Logger.getLogger(A4_ModifiedVoter.class.getName()); 	
	
	private  A4_ModifiedVoter(int age, String name)
	{
		System.out.println("obj created");
		this.age=age;
		this.name=name;
	}
	
	
	public void show()
	{
		logger.info("inside show method");
		System.out.println("Age is - "+age+"name is -"+name);
		
	}
	
	
	public static A4_ModifiedVoter createVoter(int age, String name)
	{
		A4_ModifiedVoter v = null;   //  we can declare this static variable outside this method  to create only one object
									//but our requirement is different 
								// we want to create many obj , only condition is age 18+ 
		
		if(age>17)
		{
			v = new A4_ModifiedVoter(age,name);
			
		}
		return v;
		
	}
	
	
	
}
class UseModifiedVoter
{ 
	 public static void main(String[] args) {
		
		 A4_ModifiedVoter v1 = A4_ModifiedVoter.createVoter(25,"Amit");
		 v1.show();
		 		 
		 
		 A4_ModifiedVoter v2 = A4_ModifiedVoter.createVoter(19,"Savi");
		 v2.show();
		 
		 
		 A4_ModifiedVoter v3 = A4_ModifiedVoter.createVoter(12,"Ravi"); // static method call hoga,
		 														//condition false to v me null rhega , 
		 v3.show();// null pointer exception
	}
	 
	 
}