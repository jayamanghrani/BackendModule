package javaInterviewModule.JavaBasicsmodule1;

public class M7_MethodHiding {

	public static void main(String[] args) {
		
		System.out.println("parent main called");
	}
	
	
}

class C extends M7_MethodHiding
{
	/* private static void main(String[] args) */     // Cannot reduce the visibility of the inherited method from M7_MethodHiding
	/*
	 * { System.out.println("child main called"); }
	 */

}


/*
 * We are hiding(in non technical term overridiing) static method, while hiding
 * we can't change visibility
 */