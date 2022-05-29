package javaInterviewModule.OOPSmodule3;

class Account
{
	//Explicit  initialization   (directly initialize with value)
		private int id=101;
		private String name="AMIT";
		private double balance=50000.0;
		
		
		//via constructor   (first new initialize with default then constructor initialize value)
		public Account() {
			
			id = 102;
			name = "AMIT T";
			balance = 250000.0;
			System.out.println("value initialize by const.."+id+" "+name+" "+balance);
		}

		//via parameterized constructor  
		public Account(int id, String name, double balance) {
			super();
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
	
		// initializer block (ye constructor se pehle chlte h , yehi eska main benefit h)
		
		{
			
			id=103;
		     name="AMIT M";
			 balance=40000.0;
			 System.out.println("value initialize by block.."+id+" "+name+" "+balance);
			
		}
		
		
		public void show()
		{
			System.out.println("show method "+id+" "+name+" "+balance);
		}

}

public class A7_ObjectInitialization
{
	public static void main(String[] args)
	{
		Account a = new Account();
		a.show();
		
	}
	
	
}

//Object Initialization

/** In java to initialize an object we have 3 option -*/
/*
* 1. Explicit 
* 2.Using constructor 
* 3.using initializer blocks
*/

