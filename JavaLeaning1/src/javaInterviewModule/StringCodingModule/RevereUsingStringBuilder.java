package javaInterviewModule.StringCodingModule;

import java.util.Scanner;

public class RevereUsingStringBuilder {

	
	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		System.out.println("enter value");
		String value=kb.next();
		
		StringBuilder sb = new StringBuilder(value);
		//sb.append(value);
		sb.reverse();
		System.out.println("reverse string is---"+sb);
		
	}
}
