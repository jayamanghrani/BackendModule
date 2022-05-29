package designPatterns;

public class A5_OnlyOneVoter {

	 public static void main(String[] args) {
			
		 SingletonVoter v1 = SingletonVoter.createVoter(25,"Amit");
		System.out.println(v1);
		 
		 SingletonVoter v2 = SingletonVoter.createVoter(12,"Ravi"); 
		 System.out.println(v2);
	 }
}


class SingletonVoter
{
	private int age;
	private String name;
	
	private static SingletonVoter obj= null;  // we have declared this outside, 
	
	private SingletonVoter(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "SingletonVoter [age=" + age + ", name=" + name + "]";
	}



	public static SingletonVoter createVoter(int age, String name)
	{				
		if(obj==null)                               //so only one obj will 
		{
			obj = new SingletonVoter(age,name);			
		}
		return obj;		
	}
}