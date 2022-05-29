package smallProgrames.copy2;

import java.util.Scanner;


//Armstrong number is 371 because it is the sum of 27 + 343 + 1 which is equal to 3^3 + 7^3 + 1^3. 


public class Armstrong {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter no to check armstrong");
		
		int no = kb.nextInt();
		
		System.out.println(" "+no +" is  armstrong-"+isArmStrong(no));
		
	}
	
	
	public static boolean isArmStrong(int n)
	{
		boolean isArmstrongNo=false;
		int result=0;
		int orignal=n;
		
		while(n>0)
		{
		int rem = n%10;      
		result = result +(rem*rem*rem);
		n=n/10;  
		}
		
		if(orignal==result)
		{
			return true;
		}
		
		return isArmstrongNo;
		
	}
	
	
	
}
