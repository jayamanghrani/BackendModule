package multithreading;




/** * Java Program to demonstrate how to stop a thread in Java. *
 * There is a stop() method in Thread class but its deprecated  
 * because of deadlock and other issue, but its easy to write 
 * * your own stop() method to stop a thread in Java. *
*/

class Server implements Runnable
{
	private volatile boolean exit= false;
	
	@Override
	public void run() {
		
		while(!exit)
		{ System.out.println("exit is false , "+Thread.currentThread().getName()+" is in running state");
	
		} 
		
		System.out.println("Now, exist value is true so Server is stopped....");

	}
	
	
	public void stop()
	{	exit= true;		
	}
	

}


public class M5_ThreadStopExample {
	
	
	public static void main(String[] args) 
	{
		Server myserver = new Server();
		
		Thread t1= new Thread(myserver, "JayaKaThread");
		
		t1.start(); 
		
		System.out.println("Main Thread in main method-"+Thread.currentThread().getName());
		System.out.println("Now trying to stop thread----");
		
		// To stop the thread
		myserver.stop();
		
		
		
		

	
		
	}

}
