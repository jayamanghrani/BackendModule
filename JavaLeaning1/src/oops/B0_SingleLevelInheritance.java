package oops;

 class Employee {

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
	
	public int Mymethod()
	{
		return 0;
	}
	
	
}

class Manager extends Employee
{
	private double bonus;

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
 
	 public double getIncome()
	 {
		 double amt = getSal()+bonus;      // using parent method getSal()
		 return amt;
	 }


}

class DeliveryManager extends Employee
{
	private double bonus;
	private double awardsbonus;

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

	public double getIncome()
	 {
		 double amt = getSal()+bonus+awardsbonus;      // using parent method getSal()
		 return amt;
	 }


}



public class B0_SingleLevelInheritance
{
public static void main(String[] args) {
	
	Manager m1= new Manager();              
	m1.setBonus(10000.0);
	m1.setName("AMit");
	m1.setSal(50000.0);	
	System.out.println("name of manager- "+m1.getName());
	System.out.println("income of manager- "+m1.getIncome());
	
	
	DeliveryManager m2= new DeliveryManager();
	m2.setBonus(30000.0);
	m2.setName("Ararti");
	m2.setSal(70000.0);
	m2.setAwardsbonus(5000.0);	
	System.out.println("name of delivery manager- "+m2.getName());
	System.out.println("income of delivery manager- "+m2.getIncome());
	

// in this code , we have not used polymorphism here, we are creating different reference for different obj	
	
// this code is ex. of inheritance only , 	
	
	
}	
}


