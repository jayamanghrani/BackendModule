package smallProgrames.copy;

import java.util.Scanner;

public class ReverseStringUsingByteArray {
	
	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		
		System.out.println("enter string");
		String input=kb.next();
			
		byte[] brr=input.getBytes();//[j, a, y, a]
		
		System.out.println(brr);
		
		byte[] res= new byte[brr.length];
		
		for(int i=0;i<brr.length;i++)
		{
			res[i]=brr[brr.length-i-1];// [ a, y, a,j ]
		}
		
		System.out.println(new String(res));
	}

}
