package multithreading;

public class M_ThreadIntro {

	
	public static void main(String[] args)
	{
		//JVM invoking the main method() and the thread which executes the main method is called the main thread. 
				
		System.out.println("JVM run main method by using thread and it's name is -"+Thread.currentThread().getName());
		
/*		 ANd we can create our own thread inside main method , to make or code faster*/
		
		//Java prints the name of the thread during exception
		// let take one exception case 
		System.out.println(args[1]); //[Exception in thread "main"]
		
		
	/*	What is multithreading?
				 When two threads run in parallel that is called multithreading in Java. */
		
		
	/*	In this code , we are not doing multithreading, since we haven't created any thread*/
		
		
		
// Types of thread--- (user thread and daemon thread)
		
		//1. User thread--
			/*JVM will wait for all active user threads to finish their execution before it shutdown itself.
			 * 
			 * the user threads are the normal threads you see and use in your day-to-day coding.
			 * 
			 *  Any thread you create from the main thread becomes a user thread.  
			 *  
			 *  Main thread is also a user thread
			 *  
			 *  Since the main thread is a non-daemon thread,
			 *  
			 *   any thread created from the main also becomes a non-daemon or a user thread.
			 *  
			 *  */
		
		
		// 2. Daemon Thread
			/*JVM doesn't wait for the daemon thread to finish
			 * 
			 * the daemon threads are low priority threads. 
			 * 
			 *  This means they won't get CPU as easily as a user thread can get.
			 * 
			 * If you want to create a daemon thread then you need to call the setDaemon(true) method to make it a daemon.
			 * 
			 * 
			 * 
			 * */		
		
		
		
		
		
		
	}
	
}
