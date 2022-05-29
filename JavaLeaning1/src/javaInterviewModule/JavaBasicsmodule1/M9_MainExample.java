package javaInterviewModule.JavaBasicsmodule1;

public class M9_MainExample {

	public static void main(String[] args) {
		System.out.println("parent main called");
	}	
	
}

class E extends M9_MainExample
{
	public final static void main(String[] args)   // allowed  derived me method ko final kr sate h , java ko koi problem nhi h
	{
		System.out.println("child main called");
	}
	
}