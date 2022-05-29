package multithreading;

public class DeadLockDemo {

	public void method1()
	{
		synchronized(String.class)
		{
			System.out.println("lock on String.class obj");
						
			synchronized(Integer.class)
			{
				
				System.out.println("lock on Integer.class obj");
			}						
		}		
	}
	
	
	public void method2()
	{
		synchronized(Integer.class)
		{
			System.out.println("lock on String.class obj");
						
			synchronized(String.class)
			{
				System.out.println("lock on Integer.class obj");
			}			
		}		
	}
	
	
	public static void main(String[] args) {
		
		
		Thread t1= new Thread();
		Thread t2= new Thread();
		
		
	}
	
	
	
	
	
	
	
}

// If method1 and method2 both will be called by two or many thread, there is good chance of deadlock

/*	if thread1 call method1 , method will apply lock on String class obj
Simulataneously if thread2 will call method 2 , method 2 will apply lock on Integer class obj.


Now method1 will try to lock integer class obj, and method2 vice versa
both will wait each other to release the lock*/
