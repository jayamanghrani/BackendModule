package smallProgrames.copy2;

import java.util.Scanner;

public class ReverseUsingStringBuffer {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter input");
		String input=kb.next();
		
		StringBuffer sbf= new StringBuffer();
		sbf.append(input);
		sbf.reverse();
		System.out.println("reverse is --"+sbf);
		
	}
}
