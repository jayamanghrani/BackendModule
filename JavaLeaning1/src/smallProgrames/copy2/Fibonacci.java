package smallProgrames.copy2;

public class Fibonacci {

	public static void main(String[] args)
	{		
		getFibonacciSeries(10);	
		System.out.println(" ");
		System.out.println(" Below is from loop");
		
		FibonaciiByLoop(10);
	}
	
	
	public static void getFibonacciSeries(int n)
	{		
		for(int i=1; i<=n;i++)
		{
			System.out.print(getFibonacci(i)+" ");
						
		}		
	}
	
	 public static int getFibonacci(int n)
	 {
		 if(n==1)
			 return 1;
		 
		 if(n==2)
			 return 2;
		 
		 return getFibonacci(n-1)+getFibonacci(n-2);
	 }	
	 
	 
	 
	 /*
	     * Printing Fibonacci series of a given number using for loop
	     */
	 
	 public static void FibonaciiByLoop(int n)
	 {
		 int fibo1=1;
		 int fibo2=1;
		 
		 for(int i=1; i<=n;i++)
		 {
			 int fibono= fibo1+fibo2;
			 System.out.print(fibono+"  ");
			 fibo2= fibo1;
			 fibo1= fibono;
		 }
		 
	 }
	 
}
