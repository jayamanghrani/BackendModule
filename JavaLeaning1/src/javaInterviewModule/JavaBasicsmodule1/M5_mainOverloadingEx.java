package javaInterviewModule.JavaBasicsmodule1;

public class M5_mainOverloadingEx {

	
	public static void main(String[] args) {
		System.out.println("bhopal");
	}
	
	
	public static void main(double[] args) {    //jvm will not confuse , it will not call this
		System.out.println("Indore");
	}
	
}


//We can overload the main() method

// A class can have 2 main method , but its argument should diffrent.



		