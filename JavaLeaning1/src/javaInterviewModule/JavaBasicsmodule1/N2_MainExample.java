package javaInterviewModule.JavaBasicsmodule1;

public class N2_MainExample {

	public static void main(String[] args) {
		
		System.out.println("parent main called");
	}
}

class H extends N2_MainExample
{
	
public void main(int[] args) {              // this is allowed , beacuse we are doing overloading (not overridiing)
	
	System.out.println("child main method");
}


/*public void main(String[] args) {*/              // this is not  allowed , beacuse we are doing overriding (not overloading)
	
	/*System.out.println("child main method");
} */



}