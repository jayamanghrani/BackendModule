package javaInterviewModule.JavaBasicsmodule1;

public class N3_MainExample {

	static
	{		
		System.out.println("static block called");		
	}
		
	
	public static void main(String[] args) {
		
		System.out.println("main block called");
	}
}


// static block

/*
 * 1. Automatically called
 *  2.only once 
 *  3.run before any method
 *  4. more than one static block can be there (run according to their order)
 */