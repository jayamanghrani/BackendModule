package smallProgrames.copy3;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		int i=3 ;
		Scanner kb=new Scanner(System.in);
		do{
		System.out.println("enter year");
		
		int year=kb.nextInt();
		if(year%4==0)
		{
			System.out.println(""+year+"is leap year");
			i--;
		}
		else
		{
			System.out.println(""+year+"is not a leap year");
			i--;
		}
		}while(i>1);
	}

}
