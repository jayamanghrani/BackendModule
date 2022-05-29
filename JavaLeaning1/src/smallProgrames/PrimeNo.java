package smallProgrames;

import java.util.Scanner;

public class PrimeNo {
	
public static void main(String[] args) {
		
		Scanner kb= new Scanner(System.in);
		System.out.println("enter no to check prime no.");
		int no= kb.nextInt();
		boolean res=PrimeNo.checkPrime(no);
		System.out.println(res);
		
}
		public  static boolean checkPrime(int n)
			{
				boolean res=true;
				if(n<=1)
				{
					res=false;
					return res;
				}
				else
				{
					for(int i=2;i<=n/2;i++)
					{
						if(n%i==0)
						{
							res=false;
						break;
						}
					}
					
				}
				return res;
			}


}

