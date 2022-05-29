package designPatterns;


//Create a voter class and  age of voter obj should not be less than 18

public class A3_Voter {

	int age;
	String name;
	
	
	public A3_Voter(int age, String name)   // [if we will make our constructor private , code will not compile]
	{
		System.out.println("obj created");
		this.age=age;
		this.name=name;
	}
	
	
	public void show()
	{
		
		System.out.println("Age is - "+age+"name is -"+name);
	}
}
 class UseVoter
 { 
	 public static void main(String[] args) {
		
		 A3_Voter v1 = new A3_Voter(22, "Amit");
		 v1.show();
		 
		 A3_Voter v2 = new A3_Voter(12,"Ravi"); // but we created , which is less than 18 . How to restrict this creation;		
		 v2.show();
		 
		 
	}
	 
	 
 }