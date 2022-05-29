package javaInterviewModule.Stringmodule5;

public class A2_CopyContructor {

	public static void main(String[] args) {
		
		String word= new String("Java");
		
		String word2= new String(word);/* For Above - 2 object and 2 reference */
		
		
		/* 2 reference and 1 object in pool */
		String word3="Java";
		String word4=word3; 
		
		System.out.println("hello".substring(5));
		
	} 
	
}
