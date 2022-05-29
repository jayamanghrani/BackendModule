package multithreading;

import java.util.concurrent.TimeUnit;

class MyServer implements Runnable
{

	private volatile boolean isStopped= false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(!isStopped)
		{ System.out.println(Thread.currentThread().getName()+" is in running ");
	
		System.out.println("Now going to pause it for 50 sec");
				
				try{
			//  The Thread.sleep() is a static method and it always puts thread to sleep.
					Thread.sleep(50);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
				
				System.out.println("Now,"+Thread.currentThread().getName()+" is resumed");		
		}
		
		
	}	
	
	public void stop()
	{	isStopped= true;		
	}
	
	
}


public class M6_ThreadSleepExample {

	public static void main(String[] args) throws InterruptedException
	{
		MyServer myserver = new MyServer();
		
		System.out.println("Inside "+Thread.currentThread().getName() + " thread  creating new thread jaya ka thread");
		Thread t2 = new Thread(myserver, "JayakaThread");		
		t2.start();
	
		
		
/*		When T2 starts it goes into a loop and then pauses for 200 milliseconds.
		In between, we have also put the main thread to sleep by using TimeUnit.sleep() method*/

//		So the main thread can wait for some time and in the meantime, t2 will resume and complete its execution
		
		// pausing main thread
		 TimeUnit.MILLISECONDS.sleep(100);
		 
		 
		 System.out.println(Thread.currentThread().getName()
	                + " is stopping jaya ka  thread");
		 
		 myserver.stop();
		 System.out.println(Thread.currentThread().getName() + " is finished now");
	}
	
	
}
