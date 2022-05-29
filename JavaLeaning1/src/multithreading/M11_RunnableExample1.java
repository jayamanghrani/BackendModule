package multithreading;

 class M11_RunnableExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Running Thread name--"
				+Thread.currentThread().getName());	
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
	}	
}


public class M11_RunnableExample1 
{
	public static void main(String[] args) {
		
		// thread obj is required to create every single thread
		Thread obj = new Thread(new M11_RunnableExample()); 	
		obj.run();
				
		// thread obj is required to create every single thread
		Thread obj2 = new Thread(new M11_RunnableExample());
		obj2.run();
				
	}
}
