package javaInterviewModule.JavaBasicsmodule1;

public class N8_CmdEx2 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<args.length;i++)
		{
			/* sum = sum+ args[i]; */   //  Type mismatch: cannot convert from String to int 
			
			sum = sum+Integer.parseInt(args[i]);
	
		}
		System.out.println("sum of arguments"+sum);
	}
}
