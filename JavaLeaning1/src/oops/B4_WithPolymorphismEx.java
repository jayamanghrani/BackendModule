package oops;


class TCSEmployee {

	private String name;
	private double sal;
	
	
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
	
	public double getIncome()
	{
		return sal;
	}
	public TCSEmployee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	
}

class TCSManager extends TCSEmployee
{
	private double bonus;

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "TCSManager [getIncome()=" + getIncome() + "]";
	}

	public TCSManager(String name, double sal, double bonus) {
		super(name, sal);
		this.bonus = bonus;
	}

	@Override
	 public double getIncome()
	 {
		 double amt = getSal()+bonus;      // using parent method getSal()
		 return amt;
	 }


}

class TCSDeliveryManager extends TCSEmployee
{
	private double bonus;
	private double awardsbonus;


	public TCSDeliveryManager(String name, double sal, double bonus,
			double awardsbonus) {
		super(name, sal);
		this.bonus = bonus;
		this.awardsbonus = awardsbonus;
	}

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	 public double getAwardsbonus() {
		return awardsbonus;
	}

	public void setAwardsbonus(double awardsbonus) {
		this.awardsbonus = awardsbonus;
	}

	@Override
	 public double getIncome()
	 {
		 double amt = getSal()+bonus+awardsbonus;      // using parent method getSal()
		 return amt;
	 }

	@Override
	public String toString() {
		return "TCSDeliveryManager [getIncome()=" + getIncome() + "]";
	}

	

	
	
	
}


public class B4_WithPolymorphismEx {

	public static void main(String[] args) {
			
				TCSEmployee m1;      //We are using reference of base class and obj of instance class
		
				 m1= new TCSManager("Snigdha", 60000, 5000);    
				 
				 System.out.println("name of manager- "+m1.getName());		
		 
/*		m1.setBonus(10000.0);*/// is invalid because Base class has no method with that name,
							//Your instance is a child, but you use it like a Base. Base knows nothing about his children,
		
	
				/*	TCSManager ka setBonus call hoga this Run time binding decide by JVM  and JVM run after compilation.
				
				This code will fail at compilation 
				
				because m1 don't know that m1.setBonus will called to TCSManager method , use abhi bhi ye lag rha  ki TCSEmployee ka method call ho rha h
				and TCSEmployee ke pass esa method nhi h
				*/			
				
				
				
				

				 m1= new TCSDeliveryManager("Nimesh", 80000, 5000, 2000);
				
				m1.getName();
				 System.out.println("name of manager- "+m1.getName());	
	
	}
}



// In this we are using only 1 reference, which is taking less memory


 // Es code me polymorphism kaha ho rha h ??
	/*
	 * m1.getName() -- es line pe polymorphism ho rha h ,same line diffrent o/p de
	 * rhi
	 */















/*overriding of super method*/

/*@Override
String displayDetails()
	{
		return "details of manager";
		
	}
// we can override , but overriding is not much useful here, because , we are again defining the already defined method,
// overriding is useful in interface and abstract because there we declare a method  and define in subclass

}
*/