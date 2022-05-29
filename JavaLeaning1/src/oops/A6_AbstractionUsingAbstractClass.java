package oops;

abstract class Bank {  // abstract class can only extend one class

	
// we can declare any type of variable , don't have restriction like interface	
	int bankofficers; 
	static int totalbanks;  

	
// we can add constructor and getter setters , static blocks 
	public int getBankofficers() {
		return bankofficers;
	}

	public void setBankofficers(int bankofficers) {
		this.bankofficers = bankofficers;
	}

	public static int getTotalbanks() {
		return totalbanks;
	}

	public static void setTotalbanks(int totalbanks) {
		Bank.totalbanks = totalbanks;
	}
	
	
// Abstract method
	abstract int getRateOfInterest();   //this need to be override in implementation class

	
	
//Non- abstract method
	 void displayBankdetails()
	{
		System.out.println("Bank officers are -"+this.bankofficers);
	}

	
	
}

class SBI extends Bank
{    
	
	int getRateOfInterest()
	{
		return 7;
		
	}    
}  

class PNB extends Bank
{    
	int getRateOfInterest()
	{
		return 8;
		
	}    
}     
 class TestAbstraction
 {
	
	public static void main(String[] args) {
		Bank b1  = new SBI();
		System.out.println("SBI rate of interest is -"+b1.getRateOfInterest());
		Bank b2  = new PNB();
		System.out.println("PNB rate of interest is -"+b2.getRateOfInterest());
		
	}
 }	





// Java has a concept of abstract classes, abstract method but a variable can not be abstract in Java.
	
	
	
//Abstract class

/*1.  Abstract class can contain both abstract and concrete method. An abstract method doesn't have the body, 
just declaration.

2) A class automatically becomes abstract class when any of its methods declared as abstract.

3)It is not compulsory that abstract class should contain abstract method.\

4) abstract class can have a constructor, getter setter

5) you can not create an instance of the abstract class using the new operator, its a compiler error. 

6) If a class extends an abstract class  it has to provide implementation to all its abstract methods
to become concrete class. otherwise, this class can also be abstract.*/
 
 
 //Signature -> name+ argument
 
 
 
 
 
	/**
	 * Number is abstract class in core java
	 * 
	 * Integer , Double is deveried class of Number
	 */
 
 
 
 
 
 
 