package javaInterviewModule.JavaBasicsmodule1;

public class N9_Example {

	int birds=10;
	
	public static void main(String[] args) {
		
		int trees=5;
		/* System.out.println(trees+birds); */  //Cannot make a static reference to the non-static field birds
		
		
		N9_Example obj = new N9_Example();
		/* obj.birds; */  // insert "VariableDeclarators" to complete LocalVariableDeclaration
		
		int n = obj.birds;
	}
	
}


//Now, if we want to access birds inside main method, how can we access??
		
/*We can access variable explicitly
 * 
 * 1. Make birds as static.
 * 2. create obj of class and user obj.birds instead of birds
 * 
 */		
		
		
		
		
		