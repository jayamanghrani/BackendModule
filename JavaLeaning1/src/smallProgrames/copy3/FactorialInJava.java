package smallProgrames.copy3;

import java.util.Scanner;

//Let’s talk about logic, the factorial of a number is calculated by formula number*(number -1) till zero 

public class FactorialInJava {

	public static void main(String[] args) {
		
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter no to get factorial");
	int no = kb.nextInt();
		
	
	System.out.println("Fact by recursion "+ factorialByRecursion(no));
	
	System.out.println("Fact by Iteration "+ factorialByIteration(no));
	
	
	}
	
	public static int factorialByRecursion(int n)
	{
		
		if(n==0)
		return 1;
		
		
		return n*factorialByRecursion(n-1);
		
		
		
	}
	
	public static int factorialByIteration(int n)
	{
		int fact=1;
		
		while(n!=0)
		{
			fact = n*fact;
			n--;
		}
		
		return fact;
	}
	
	
}

/*That's all on how to calculate or find the factorial of a number in Java.
Both iterative and recursive versions of factorial can be used to calculate 
factorials but beware of StackOverFlowError if a larger number is passed to 
the recursive version of the factorial method in Java.*/


