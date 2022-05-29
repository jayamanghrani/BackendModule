package smallProgrames.copy2;

import java.util.Scanner;

public class ReverseUsingCharacterArray {

	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		System.out.println("enter string");
		String input=kb.next();
		
		char ch[]=input.toCharArray();
		System.out.println(ch);
		
		for(int i= ch.length-1; i>=0;i--)
		{
		System.out.print(ch[i]);
		}
		
		
	}
	
}
