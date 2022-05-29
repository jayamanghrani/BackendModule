package multithreading;

 class SynchronizationTypes {
	
}

//There are two types of synchronization*/

/*Block synchronization in Java is preferred over method synchronization in Java
because by using block synchronization, you only need to lock the critical section of code 
instead of the whole method. */

//1. Method synchronization
/*        -->static synchronized method locked on class object      [class level lock]
		
		 -->nonstatic synchronized method locks on current object (this) [object level lock]       */

		//Synchronized Method Example in Java
/*		Using synchronized keyword along with method is easy just apply synchronized keyword in front of the method.
		What we need to take care is that static synchronized method locked on class object
		and nonstatic synchronized method locks on current object (this).
		So it’s possible that both static and nonstatic java synchronized method running in parallel.
		This is the common mistake a naive developer do while writing Java synchronized code.


				public class Counter{
				
					  private static int count = 0;
				
					  public static synchronized int getCount(){
					    return count;
					  }
				
					  public synchoronized setCount(int count){
					     this.count = count;
					  }
				
					}
					
			the synchronization code is not properly synchronized because both getCount() and setCount()
			 are not getting locked on the same object and can run in parallel which may result in the
			  incorrect count.		
					
					
			To make this code properly synchronized in Java you need to either make both method static
			 or
			 nonstatic
			  or
			 use java synchronized block instead of java synchronized method. 		
*/

// 2. Synchronized Block Example in Java

 /*	
			public class Singleton
			{			
			private static volatile Singleton instance;
			
				public static Singleton getInstance()
				{
				   if(instance == null)
				   {
				            synchronized(Singleton.class)
				            {
				               //double checked locking - because second check of Singleton instance with lock
				              if(instance == null)
				                  instance = new Singleton();
				            }
				   }
				   return instance;
				}
			}

		If you make the whole method synchronized than every call of this method will be blocked, 
			while you only need blocking to create singleton instance on the first call. 
			this is not the only way to write threadsafe singleton in Java.
			You can use Enum, or lazy loading to avoid thread-safety issue during instantiation. */













