package javaInterviewModule.OOPSmodule3;

import java.util.Scanner;

//WAP to take class name from user and create its obj 

public class A6_ObjectOnDemand {

	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter fully qualified class name");
		String classname = kb.next();  //java.util.Date
		
		Class c= Class.forName(classname);
		
		Object obj=c.newInstance();
		System.out.println("object created of class :"+obj.getClass().getName());
		System.out.println(obj);
		
	}
	
}
