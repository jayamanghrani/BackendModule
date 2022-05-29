package multithreading;

public class M3_ThreadExample1 extends Thread{

/*	We can achieve basic functionality of a thread by extending Thread class 
	because it provides some inbuilt methods like getId(), interrupt() etc.
	that are not available in Runnable interface.
	*/
	
	
/*	If we extend the Thread class, our class cannot extend any other class 
	because Java doesn’t support multiple inheritance.	*/
	
	public static void main(String[] args)
	{	
		
		// We are creating new Thread , 
		M3_ThreadExample1 t1 = new M3_ThreadExample1();
		// Now total 2 threads are there (main, t1)-----this is called multithreading
		
		
		t1.start(); // on calling start- Java Virtual Machine calls the run method of this thread
		// if we have implemented then, our run method will execute , otherwise Thread class ka method will run
		
		//t1.run(); // it will not create thread	
	}
		

	
	
	
	// This class overrides the run() method available in the Runnable interface	
	@Override
	public void run()
	{
		System.out.println("start method internally calls  to run method , "
				+ "therefore thread "+Thread.currentThread().getId()
				+" is running");
		System.out.println("Name--"+Thread.currentThread().getName());	
		System.out.println("-------------------------------------");
		System.out.println("Id--"+Thread.currentThread().getId());
		System.out.println("Name--"+Thread.currentThread().getName());
		System.out.println("Priority--"+Thread.currentThread().getPriority());
		System.out.println("info--"+Thread.currentThread().toString());
		System.out.println("State--"+Thread.currentThread().getState());
		System.out.println("ThreadGroup---"+Thread.currentThread().getThreadGroup());
	}
	
}
