package javaInterviewModule.JavaBasicsmodule1;

public class M8_MethodHiding2 {

	
	public final static void main(String[] args) {
		
		System.out.println("parent main called");
	}
	
}


class D extends M8_MethodHiding2
{
	

	/* public static void main(String[] args)          //Cannot override/hide the final method from M8_MethodHiding2
	/*
	 * { System.out.println("child main called"); }
	 */

}