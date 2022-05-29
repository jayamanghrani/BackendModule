package multithreading;

public class M7_ThreadJoinExample extends Thread{


	public static void main(String[] args) throws InterruptedException
	{
//		Now if your main thread creates new thread and executes this line t1.join()
//      then the main thread will wait for the T1 thread to finish its execution. 		
		
		M7_ThreadJoinExample t1 = new M7_ThreadJoinExample();
		t1.start();
		//Main will not execute next lines until new thread finished");
		//This will pause main thread until 
		t1.join(); 
		
		System.out.println("this line will print when t1 thread will finished");
		
		
		
	}	
 
@Override
public void run()
{
	System.out.println("New Thread is running");	
	System.out.println("Name--"+Thread.currentThread().getName());	
	System.out.println("Id--"+Thread.currentThread().getId());
	System.out.println("Priority--"+Thread.currentThread().getPriority());
	System.out.println("info--"+Thread.currentThread().toString());
	System.out.println("State--"+Thread.currentThread().getState());
	System.out.println("ThreadGroup---"+Thread.currentThread().getThreadGroup());
}
		

	
}
