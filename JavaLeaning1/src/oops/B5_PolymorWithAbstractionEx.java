package oops;


abstract class CTSEmployee
{
	private String name;
	private double sal;
	
	
	
	public CTSEmployee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public abstract double getIncome();  // abstract method , need not to provide body ,and overriding is compulsory in derived  class
/*	Use abstraction if you know something needs to be in class but the implementation of that varies. 
*/}

class CTSManager extends CTSEmployee
{
	private double bonus;
	public CTSManager(String name, double sal, double bonus) {
		super(name, sal);
		this.bonus=bonus;
		// if you will not add constructor in base class, error (Implicit super constructor CTSEmployee() is undefined for default constructor. Must define an explicit constructor)
	}

	@Override
	 public double getIncome()
	 {
		double total= getSal()+bonus;
		return total;
	 }

	@Override
	public String toString() {
		return "CTSManager [getIncome()=" + getIncome() + "]";
	}


}

class CTSDeliveryManager extends CTSEmployee
{

	private double bonus;
	private double awardsbonus;

	
	public CTSDeliveryManager(String name, double sal,double bonus,double awardbonus) {
		super(name, sal);
		this.awardsbonus=awardbonus;
		this.bonus= bonus;
		
	}

	@Override
	 public double getIncome()
	 {
		double total= getSal()+awardsbonus+bonus;
		return total;
	 }

	@Override
	public String toString() {
		return "CTSDeliveryManager [getIncome()=" + getIncome() + "]";
	}


	
}


public class B5_PolymorWithAbstractionEx {

	public static void main(String[] args) {
		
		CTSEmployee e1 = new CTSManager("Jaya",30000.0,2000);
		CTSEmployee e2 = new CTSDeliveryManager("Ararti",50000.0,5000,1000);
		
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		
	}
	
	
}
