package smallProgrames;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		System.out.println("enter no.");
		int no= kb.nextInt();
		
		System.out.println("Sum using iteration -"+sumByIteration(no));
		
		System.out.println("Sum using iteration -"+sumByRecursion(no));
		
		
	
		//Sum of digit using Iteration
	 
	}
	
	public static int sumByIteration(int n)
	{

				int sum=0;		
				while(n>0)
				{
					sum=sum+n%10;
					n=n/10;
				}
				return sum;
	}
	
	public static int sumByRecursion(int n)
	{
		if(n/10==0)		
			return n;
		
		
		return n%10 +sumByRecursion(n/10);
	}
	

}





