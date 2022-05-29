package multithreading;

public class M4_ThreadExample2 extends Thread {

	public static void main(String[] args)
	{
		//M4_ThreadExample2 t2 = new M4_ThreadExample2(); // [Error- java.lang.IllegalThreadStateException]

			for(int i=1;i<=5;i++)
			{
				M4_ThreadExample2 t2 = new M4_ThreadExample2();// [for every thread , new obj required]
				t2.start();
				
			}	
	}
	
	
	
	public void run()
	{
		System.out.println("start method internally calls  to run method , therefore thread "+Thread.currentThread().getId()+" is running");
	
		System.out.println("Id--"+Thread.currentThread().getId());
		System.out.println("Name--"+Thread.currentThread().getName());
		System.out.println("Priority--"+Thread.currentThread().getPriority());
		System.out.println("info--"+Thread.currentThread().toString());
		System.out.println("State--"+Thread.currentThread().getState());
		System.out.println("ThreadGroup---"+Thread.currentThread().getThreadGroup());
		
	
		
	System.out.println("-------------------------------------");
	
	
	}
	
	
	
}
